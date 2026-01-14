import java.util.Scanner;

public class SpacePattern {

    public static void printPattern(int n) {
        int patternWidth = 1;
        int space = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");

            }
            for (int j = 1; j <= patternWidth; j++) {
                System.out.print("*   ");
            }
            patternWidth++;
            space--;
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