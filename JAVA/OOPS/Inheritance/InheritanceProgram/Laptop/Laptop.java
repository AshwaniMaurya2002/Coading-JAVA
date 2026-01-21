
public class Laptop extends  Electronic {
    
    String name;
    int ram;

    public Laptop() {
    }

    public Laptop(String brand, int id,int voltage, String chargingType,String name, int ram) {
        super(brand, id, voltage, chargingType);
        this.name = name;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return super.toString()+"Name of the laptop is: "+name+"Ram of the laptop is: "+ram;
    }

    

    
    
}
