import java.util.Scanner;

public class Q23 {

    public static void printPattern(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(num + " \t");
                num++;
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
