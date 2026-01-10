import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = n * (n + 1) / 2; 

        for (int i = 1; i <= n; i++) {
            int var = num - i + 1;

            for (int j = 1; j <= i; j++) {
                System.out.print(var + " ");
                var++;
            }
            num -= i;
            System.out.println();
        }
    }
}
