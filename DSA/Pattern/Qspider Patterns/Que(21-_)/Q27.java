import java.util.Scanner;

public class Q27 {
    // Function to print the inverted number pattern
    public static void printPattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number Of Rows:");
        int n = sc.nextInt();
        printPattern(n);
    }
}