
public class Car extends Vehicle {
    String brand;
    int hp;
    int stroke;

    public Car() {
    }

    public Car(String color, int noOfWheels, String typeofVehicle,String brand, int hp, int stroke) {
        super(color, noOfWheels, typeofVehicle);
        this.brand = brand;
        this.hp = hp;
        this.stroke = stroke;
    }

     @Override
    public String toString(){
        return  super.toString()+"\nBrand is: "+brand+"\thp is: "+hp+"\tstroke: "+stroke;
    }

    
    
}
