import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();

        int num = 1;

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("   "); // spacing
            }

            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.printf("%-3d", num);
                num++;
            }

            System.out.println();
        }
    }
}
