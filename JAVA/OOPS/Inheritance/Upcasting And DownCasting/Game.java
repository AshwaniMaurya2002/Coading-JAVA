import java.util.Scanner;

public class Game {
	
	static {
		System.out.println("=======Game Has Started========");
	}
	
	
	
	public   static Vehicle selectVehicle() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1==>For Car");
		System.out.println("Press 2==>For Bus");
		System.out.println("Press 3==>For Bike");
		int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    {
                        System.out.println("You have selected Car");
                        Car c=new Car();
                        return c;
                    }
                case 2:
                {
                    System.out.println("You have selcted Bus");
                    Bus b=new Bus();
                    return b;
                }
                case 3:
                {
                    System.out.println("You have selected Bike");
                    Bike b=new Bike();
                    return b;
                }
                default:
                    System.out.println("Invalic choice enterd!!");
                    return selectVehicle();
            }
		
	}

}