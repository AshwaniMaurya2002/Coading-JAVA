import java.util.Scanner;

class ScannerProblem {

    public static void main(String[] args) {

        // case 1: Solution using an extra nextLine() to consume the newline character
        // nextInt() does not consume the newline character after the integer input
        // so we need to add an extra nextLine() to consume it.

        Scanner sc = new Scanner(System.in);
        Scanner sp = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age = sc.nextInt();
        System.out.println("Your Age is: " + age);
        System.out.println("Enter Your NameWA:");
        String name = sp.nextLine();
        System.out.println("Your Name is: " + name);

        // case 2: Here We Does Not face problem because we are using a new Scanner
        // Object
        // which starts fresh and does not have any leftover newline characters in its
        // buffer.

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name2 = sc2.nextLine();
        System.out.println("Your Name is: " + name2);
        System.out.println("Enter Your Last Name:");
        String lastName = sc2.nextLine();
        System.out.println("Your Last Name is: " + lastName);
        sc.close();
        sc2.close();
    }
}