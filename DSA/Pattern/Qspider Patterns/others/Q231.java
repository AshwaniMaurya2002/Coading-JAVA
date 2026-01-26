import java.util.Scanner;

public class Q231 {

    public static void printPattern(int n) {

       
       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if (j == i || j == (2 * n - i - 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number Of Rows: ");
        int n = sc.nextInt();
        printPattern(n);
    }
}
