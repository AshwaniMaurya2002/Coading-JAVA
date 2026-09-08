
import java.util.ArrayList;
import java.util.Scanner;

public class ZeroPay {



                

    ArrayList<EmployeeData> list = new ArrayList<>();
    EmployeeData em = new EmployeeData();

    public void getAccount() {

        Scanner sc = new Scanner(System.in);
        System.out.println("email");
        em.setEmail(sc.next());
        System.out.println("Password");
        em.setPassword(sc.next());
        System.out.println("Amount");
        em.setAmout(sc.nextInt());

        list.add(em);

        System.out.println(em);

    }

//     public static void getLogin(EmployeeData e) {
                
                

//     }

//     public static void updateProfile() {

//     }

//     public static void transferAmount() {

//     }

}
