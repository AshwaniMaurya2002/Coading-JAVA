import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("   "); // 3 spaces
            }

            // numbers
            for (int j = i; j >= 1; j--) {
                System.out.printf("%-3d", j);

            }

            System.out.println();
        }
    }
}
