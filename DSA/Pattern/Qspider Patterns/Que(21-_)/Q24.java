import java.util.Scanner;

public class Q24 {

    // public static int countPattern(int n) {
    //     int count = 0;
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = i; j >= 1; j--) {
    //             count++;
    //         }
    //     }
    //     return count;

    // }

    public static void printPattern(int n) {
        int num = n*(n+1)/2;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(num + "  ");
                num--;
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
