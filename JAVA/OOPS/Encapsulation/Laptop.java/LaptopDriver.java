public class LaptopDriver {

    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("Dell", "XPS 13", 999.99);

        System.out.println("Brand: " + myLaptop.getBrand());
        System.out.println("Model: " + myLaptop.getModel());
        System.out.println("Initial Price: " + myLaptop.getPrice());

        myLaptop.setPrice(899.99);
        System.out.println("Price after update: " + myLaptop.getPrice());

        myLaptop.setPrice(0);
    }

}
