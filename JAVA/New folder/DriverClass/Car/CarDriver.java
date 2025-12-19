
public class CarDriver {

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
	System.out.println("-----------------------------\n");
        System.out.println("Before intialization");
        c1.printDetails();
        c2.printDetails();
        c3.printDetails();

	//mutator or setter method
        c1.setDetails("TATA", 24242, 120);
        c2.setDetails("MARUTI", 53534, 180);
        c3.setDetails("MG", 347859834, 190);
	System.out.println("-----------------------------\n");

	//accessor or getter method
        System.out.println("After Intialization");
        c1.printDetails();
        c2.printDetails();
        c3.printDetails();
    }
}
