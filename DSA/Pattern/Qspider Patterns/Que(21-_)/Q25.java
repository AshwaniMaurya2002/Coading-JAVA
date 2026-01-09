import java.util.Scanner;

public class Q25 {

    public static void printPattern(int n) {
        // calculate no of iterations

        for (int i = 1; i <= n; i++) {
            // logic
            int num = i * (i + 1) / 2;
            for (int j = 0; j < i; j++) {
                System.out.print(num - j + "  ");

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the Number Of Rows");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);

    }

}
