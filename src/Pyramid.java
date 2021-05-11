
public class Pyramid {
    private String Pharaoh;
    private String Modern_name;
    private String site;
    private double height;
    Pyramid(String Pharaoh, String Modern_name, String site, double height){
        this.Pharaoh=Pharaoh;
        this.Modern_name=Modern_name;
        this.site=site;
        this.height=height;
    }
    public String getPharaoh() {
        return Pharaoh;
    }
    public void setPharaoh(String pharaoh) {
        Pharaoh = pharaoh;
    }
    public String getModern_name() {
        return Modern_name;
    }
    public void setModern_name(String modern_name) {
        Modern_name = modern_name;
    }
    public String getSite() {
        return site;
    }
    public void setSite(String site) {
        this.site = site;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}