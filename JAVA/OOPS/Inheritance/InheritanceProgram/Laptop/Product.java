
public class Product {

    String brand;
    int id;

    public Product() {
    }

    public Product(String brand, int id) {
        this.brand = brand;
        this.id = id;
    }
    
    
    @Override
    public String toString(){
        return "Brand is: "+brand+"Id is: "+id;
        
    }

    
}
