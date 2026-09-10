
import java.util.ArrayList;
import java.util.Scanner;

public class account {

    public static void main(String[] args) {

        ArrayList<employee> list = new ArrayList();

        employee em = new employee();

        Scanner sc = new Scanner(System.in);
        System.out.println("email");
        em.email = sc.next();

        System.out.println("password");
        em.password = sc.next();

        

        System.out.println(em);
    }

}
