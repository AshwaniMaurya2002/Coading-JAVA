
public class CarDriver {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("BUS", 53525, "white");
        Car c3 = new Car("TAXI", 3453);
        Car c4 = new Car(364346);
        Car c5 = new Car("AUTO");
        Car c6 = new Car(53535, "BIKE");

        System.out.println(c1.getDetails());
        System.out.println(c2.getDetails());
        System.out.println(c3.getDetails());
        System.out.println(c4.getDetails());
        System.out.println(c5.getDetails());
        System.out.println(c6.getDetails());

    }

}
