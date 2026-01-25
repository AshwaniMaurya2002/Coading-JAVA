import java.util.Scanner;

public class Q83 {

    public static void printPattern(int n) {

        int space = n - 1;
        int patternWidth = 1;
        int num = 1;

        for (int i = 1; i <= n; i++) {

            int mid = (patternWidth / 2) + 1;

            // spaces
            for (int j = 1; j <= space; j++) {
                System.out.printf("%4s", ""); // SAME WIDTH
            }

            // numbers
            for (int j = 1; j <= patternWidth; j++) {
                if (j == mid)
                    System.out.printf("%4d", 0);  // SAME WIDTH
                else
                    System.out.printf("%4d", num++);
            }

            space--;
            patternWidth += 2;
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
