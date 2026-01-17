
import java.util.Scanner;

public class FullButttefly {

    public static void printPattern(int n) {
        int mid = n / 2 + 1;
        int sStar = 1;
        int eStar = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= sStar || j >= eStar || j == mid || j == mid + 1 && (i == 1 || i == 2) || j == mid
                        || j == mid - 1 && (i == n || i == n - 1)) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");
                }
            }
            if (i < mid) {
                sStar++;
                eStar--;
            } else {
                sStar--;
                eStar++;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the no of rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);

    }
}
