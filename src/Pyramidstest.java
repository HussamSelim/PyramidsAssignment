//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Pyramidstest  {

	public static void main(String[] args) throws IOException {
		
		PyramidsCSVDAO obj=new PyramidsCSVDAO();
		
		List<Pyramid> display=new ArrayList<Pyramid>();
		
		String file="E:\\iti\\Java & UML Programming\\pyramids.csv";
		
		display=obj.readPyramidsFromCSV(file);
		for (Pyramid p: display) { //System.out.printf("%s	  %s	  %s	  %f  \n",p.getPharaoh(),p.getModern_name(),p.getSite(),p.getHeight());
	}

		
		/*Collections.sort(display,new sortby());
		for (int i =0 ; i<display.size(); i++) {
			System.out.println(display.get(i).getModern_name()+ "            "+display.get(i).getHeight());
			
		}
	*/
		Psite(display);
	}
	
	public static void Psite (List<Pyramid> pyramids) {
		Map<String, Integer> countBySite=new HashMap<>();
		for (Pyramid p: pyramids) {
			String site= p.getSite();
			Integer count=countBySite.get(site);
			if (count==null) count=1;
			else count++;
			countBySite.put(site, count);
		}
		System.out.println(countBySite);
			
		}
	}