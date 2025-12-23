
import java.util.Scanner;

class ScannerClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // gives Error it skips nextLine
        System.out.println("ENTER A NUMBER");
        int num = sc.nextInt();
        System.out.println("The number is: " + num);

        System.out.println("ENTER A STRING");
        sc.nextLine(); // to consume the leftover newline character
        String str = sc.nextLine();
        System.out.println("the Entered String IS: " + str);
    }

}