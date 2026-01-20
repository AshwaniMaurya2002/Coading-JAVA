public class Vehicle {
    String color;
    int noOfWheels;
    String typeofVehicle;

    public Vehicle() {
    }

    public Vehicle(String color, int noOfWheels, String typeofVehicle) {
        this.color = color;
        this.noOfWheels = noOfWheels;
        this.typeofVehicle = typeofVehicle;
    }

    @Override
    public String toString(){
        return  "Color: "+color+"\tnoOfWheels: "+noOfWheels+"\tType of Vehicle: "+typeofVehicle;
    }

    


}
