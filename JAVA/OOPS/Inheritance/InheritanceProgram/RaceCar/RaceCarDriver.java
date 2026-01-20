
public class RaceCarDriver {
    public static void main(String[] args) {
        RaceCar rc1=new RaceCar("RED",4,"petrol","Toyota",1000,8,"Supra",450);

        System.out.println(rc1);

        RaceCar rc2=new RaceCar();
        rc2.brand="ferrari";
        System.out.println(rc2);
    }
    
}
