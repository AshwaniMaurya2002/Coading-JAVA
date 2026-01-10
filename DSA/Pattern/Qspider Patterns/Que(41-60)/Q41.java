import java.util.Scanner;

public class Q41 {

    public static void printPattern(int n) {
        // calculate no of iterations

        for (int i = 1; i <= n; i++) {
            // logic
            int num = i * (i + 1) / 2;

            for (int s = 1; s <= n - i; s++) {
                System.out.print("   "); // 3 spaces
            }
            for (int j = 0; j < i; j++) {
                System.out.printf("%-3d", num - j);

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
