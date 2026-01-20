
public class RaceCar extends Car {
    String raceCarModel;
    int raceCarSpeed;

    public RaceCar() {
    }

    public RaceCar(String color, int noOfWheels, String typeofVehicle,String brand, int hp, int stroke,String raceCarModel, int raceCarSpeed) {
        super(color, noOfWheels, typeofVehicle, brand, hp, stroke);
        this.raceCarModel = raceCarModel;
        this.raceCarSpeed = raceCarSpeed;
    }

     @Override
    public String toString(){
        return  super.toString()+"\n Race Car Model: "+raceCarModel+"\t Race car speed: "+raceCarSpeed;
    }


    

}
