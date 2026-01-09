import java.util.Scanner;

public class Q11 {

    public static void printPattern(int n) {
        int mid = (n / 2) + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == mid || j == mid || i == 1 || i == n || i == j || i + j == n + 1 || j == 1 || j == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
             System.out.println();
        }
        for (int j = 1; j <= n; j++) {
                System.out.println("**");
            }
    }

    public static void main(String[] args) {
        System.out.println("Enter the Number Of Rows");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);

    }

}
