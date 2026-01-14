
public class Vehicle {
     static {
        System.out.println("  Vehicle static block-1");
    }
    static {
        System.out.println("  Vehicle static block-2");
    }

    {
        System.out.println(" Vehicle Non -static block");
    }

    Vehicle() {
        System.out.println("Vehicle Constructor ");
    }
}
