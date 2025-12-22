
import java.util.Scanner;

class ScannerClass {

    public class ScannerInputExample {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your age: ");
            int age = sc.nextInt(); // reads only the number

            sc.nextLine(); // consume leftover newline

            System.out.print("Enter your full name: ");
            String name = sc.nextLine(); // now reads actual line input

            System.out.println("Output:");
            System.out.println("Age: " + age);
            System.out.println("Name: " + name);

            sc.close(); // close Scanner
        }
    }

}
