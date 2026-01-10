import java.util.Scanner;

public class Self {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int num = i * (i + 1) / 2;
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (num + 64) + " ");
                num--;
            }

            System.out.println();
        }
    }
}
