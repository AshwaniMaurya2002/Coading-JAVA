
public class Car extends Vehicle {

    static {
        System.out.println(" Car  static block-1");
    }
    static {
        System.out.println(" Car  static block-2");
    }

    {
        System.out.println("Car Non -static block");
    }

    Car() {
        System.out.println("Car Constructor ");
    }
}
