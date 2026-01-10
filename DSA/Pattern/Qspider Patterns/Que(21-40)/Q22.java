import java.util.Scanner;

public class Q22 {

    public static void printPattern(int n) {
       
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >=1; j--) {
                System.out.print(j + " ");

            }
            System.out.println();
         
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the Number Of Rows");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);

    }

}
