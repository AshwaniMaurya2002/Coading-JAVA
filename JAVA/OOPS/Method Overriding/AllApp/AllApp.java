
import java.util.Scanner;

public class AllApp {


    {
        System.out.println("choose 1 for Flipkart");
        System.out.println("choose 2 for zomato");
        System.out.println("choose 3 for Amazon");
    }


    public EcommApp selectApp(){

        System.out.println("Select the Required app");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();

        switch (choice) {
            case 1:
            
            System.out.println("You have selected flipkart");
            return new Flipkart();

    case 2:
        System.out.println("You have select Zomato Place Your order");
        return  new Zomato();
    
case 3:
    System.out.println("You have selectedd Amazon");
    return  new Amazon();
            default:
                return  selectApp();
        }

    }
    
}
