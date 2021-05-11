import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class PyramidsCSVDAO {
	public double ParseDouble(String strNumber) {
		   if (strNumber != null && strNumber.length() > 0) {
		       try {
		          return Double.parseDouble(strNumber);
		       } catch(Exception e) {
		          return -1;   // or some value to mark this field is wrong. or make a function validates field first ...
		       }
		   }
		   else return 0;
		}

	public List<Pyramid> readPyramidsFromCSV(String fileName) throws IOException{
    List<Pyramid> pyramidInfo= new ArrayList<Pyramid>();
    FileReader fr= new FileReader(fileName);
    BufferedReader br=new BufferedReader(fr);
    String[] parts;
    Pyramid pd;
    String line="";
    String header=br.readLine();
    if (line!=null) {
       String[] part=header.split(",");
       System.out.println(part[0]+"		 "+part[2]+"		 "+part[4]+"		 "+part[7]);
        }
    while (line != null) {
        try {
            line=br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (line!=null) {
        parts=line.split(",");
        pd= new Pyramid(parts[0],parts[2],parts[4],ParseDouble(parts[7]));
        pyramidInfo.add(pd);
        }
    }
    return pyramidInfo;
    
    
    }

    
}

