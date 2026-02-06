public class Shirts {

    String brand,color;
    double price;
    int size;

    public Shirts() {
    }

    public Shirts(String brand, String color, double price, int size) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.size = size;
    }

    @Override
    public String toString() {
        return "  Brand IS  "+brand+"  color IS  "+color+"  Price is  "+price+"  size is  "+size;
    }
    

    
    
}
