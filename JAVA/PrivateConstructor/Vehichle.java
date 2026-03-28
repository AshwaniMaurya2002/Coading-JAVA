public class Vehichle {


    String brand;
    int price;

    private  Vehichle(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public void drive(){
        System.out.println("drive");
    }
    
}
