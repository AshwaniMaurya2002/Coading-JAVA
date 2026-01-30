import java.util.Scanner;

class Q249 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                // how many numbers are already used before column j
                long offset = (long)(j - 1) * (2L * n - j + 2) / 2;

                long val;
                if (j % 2 == 1) {           // odd column: increasing
                    val = 1 + offset + (i - j);
                } else {                     // even column: decreasing
                    val = offset + (n - i + 1);
                }

                System.out.printf("%-4d", val);
            }
            System.out.println();
        }
    }
}