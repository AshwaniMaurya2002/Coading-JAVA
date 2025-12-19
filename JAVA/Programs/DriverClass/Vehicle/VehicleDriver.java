
public class VehicleDriver {

    public static void main(String[] args) {
        Vehicle car1 = new Vehicle();
        car1.brand = "Toyota";
        car1.year = 2020;
        car1.color = "Red";

        Vehicle car2 = new Vehicle();
        car2.brand = "Honda";
        car2.year = 2018;
        car2.color = "Blue";

        System.out.println("---------Object1 Car1--------------");
        System.out.println("Brand: " + car1.brand);
        System.out.println("Year: " + car1.year);
        System.out.println("Color: " + car1.color);

        System.out.println("\n---------Object2 Car2--------------");

        System.out.println("\nBrand: " + car2.brand);
        System.out.println("Year: " + car2.year);
        System.out.println("Color: " + car2.color);
    }
}
