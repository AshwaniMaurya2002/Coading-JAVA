import java.util.Scanner;

public class ReverseTri {

    public static void printPattern(int n) {
        int patternWidth = 2*n-1;
        int space = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");

            }
            for (int j = 1; j <= patternWidth; j++) {
                System.out.print("* ");
            }
            patternWidth -=2;
            space++;
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