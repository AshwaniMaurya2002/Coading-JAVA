import java.util.Scanner;

public class Q20 {

    public static void printPattern(int n) {
        int mid = (n / 2) + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j%2 + " ");

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
