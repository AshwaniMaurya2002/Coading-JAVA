import java.util.Scanner;

public class Q79 {

    public static void printPattern(int n) {

        int space = n - 1;
        int patternWidth = 1;

        
        for (int i = 1; i <= n; i++) {

                 int num = i;        // jis row pr h usi row se start hoga
            int mid = (patternWidth / 2) + 1; // calculate mid per row

            // spaces
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }

            // numbers
            for (int j = 1; j <= patternWidth; j++) {
                System.out.print(num + " ");

                if (j < mid) {
                    num--;
                } else {
                    num++;
                }
            }
            
            space--;
            patternWidth += 2;
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
