
import java.util.Scanner;

public class biggestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a >= b && a >= c) {
            System.out.println(a + " is biggest");
        } else if (b >= c) {
            System.out.println(b + " is biggest");
        } else {
            System.out.println(c + " is biggest");
        }
    }

}
