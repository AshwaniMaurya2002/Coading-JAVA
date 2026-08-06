
import java.util.Scanner;

public class nextTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n - 1;
        int star = 1;
        for (int i = 0; i < n; i++) {
            int print = 1;
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < star; j++) {
                System.out.print(print + " ");
                print++;
            }

            for (int j = 0; j < i; j++) {
                System.out.print((print - 2) + " ");
                print--;
            }

            star++;
            space--;

            System.out.println();
        }

        sc.close();
    }
}
