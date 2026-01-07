
public class Car {

    String name;
    int price;
    String color;

    public Car() {
        System.out.println("i am no argument consturctor");
    }

    public Car(String name, int price, String color) {
        // this.name = name;

        // this.price = price;

        this(name, price);
        this.color = color;
    }

    Car(String name, int price) {
        this.name = name;
        this.price = price;

    }

    Car(int price, String name) {
        this(name, price);

    }

    Car(int price) {
        this.price = price;

    }

    Car(String name) {
        this.name = name;
    }

    // constructor with same data type and arguments are not possible this is the
    // limitation of the constructor
    // Car(String color)
    // {
    // this.color=color;

    // }

    public String getDetails() {
        return "Name Is : " + this.name + "\nPrice IS : " + price + "\nColor IS: " + color
                + "\n-------------------------";
    }

}
