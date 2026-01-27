
import java.util.Scanner;

public class VendingMachine {
    

    public Drinkable selectDrink(){

        System.out.println("choose 1 for coffee");
        System.out.println("chooose 2 for juice");
        System.out.println("choose 3 for coke");
        System.out.println("chooose 4 for wine");

        Scanner sc=new Scanner(System.in);

        int choice=sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("choose 1");
                Coffee c=new Coffee();
                return c;
                
            case 2:
            	System.out.println("choose 2");
            	return new Juice();
            	
            case 3:
            	System.out.println("choose 3");
            	return new Coke();
            case 4:
            	System.out.println("choose 4");
            	return new Wine();
            	
            default:
                return  selectDrink();
        }



    }


}
