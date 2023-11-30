
package pkg22205043.pbo.lat57;

/* Nama : Danish Fadlan Azam Nim : 22205043 
 * Prodi : Teknik Informatika
 * Semseter : 3/pagi
 */



class Vehicle {
    private String myBrand;
    private String myModel;
    
    public Vehicle(){
        
    }

    public String getBrand() {
        return myBrand;
    }

    public String getModel() {
        return myModel;
    }

    public void setBrand(String myBrand) {
        this.myBrand = myBrand;
    }

    public void setModel(String myModel) {
        this.myModel = myModel;
    }
    
    
}

class Skateboard extends Vehicle {
    private double myBoardLeght;
    public Skateboard(){
        System.out.println("Skateboard");
    }

    public double getBoardLeght() {
        return myBoardLeght;
    }

    public void setBoardLeght(double myBoardLeght) {
        this.myBoardLeght = myBoardLeght;
    }
    
}

class Bicycle extends Vehicle{
    private int myGearCount;
    
    public Bicycle(){
        System.out.println("Bicycle");
    }

    public int getGearCount() {
        return myGearCount;
    }

    public void setGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }
    
}

public class PBOLat57{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Bicycle bcycl = new Bicycle();
        bcycl.setBrand("Trek Bike");
        bcycl.setModel("7.4FX");
        bcycl.setGearCount(23);
        System.out.println("Brand : "+bcycl.getBrand());
        System.out.println("Model : "+bcycl.getModel());
        System.out.println("Jumlah Gear : "+bcycl.getGearCount());
        System.out.println("");
        
        Skateboard sktb = new Skateboard();
        sktb.setBrand("Ally sktb");
        sktb.setModel("Rocket");
        sktb.setBoardLeght(54.5);
        System.out.println("Brand : "+sktb.getBrand());
        System.out.println("Model : "+sktb.getModel());
        System.out.println("Panjangnya Board : "+sktb.getBoardLeght());
    }
    
}
