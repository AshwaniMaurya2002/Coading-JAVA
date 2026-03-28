public class Vehichle {


    private static  String brand;

    private static  int price;

    private static  Vehichle v=null;


    private  Vehichle(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public static Vehichle getInstance(){
        if(v==null)
             v= new Vehichle(brand, price);
        return v;
    }

    public void drive(){
        System.out.println("drive");
    }
    public void test(){
        System.out.println("test vehicle");
    }
    
}
