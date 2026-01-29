import java.util.Scanner;

public class Q107{

    public static void printPattern(int n) {

        int space = 0;
        int patternWidth = 2*n-1;
       

        for (int i = 1; i <= n; i++) {


            // spaces
            for (int j = 1; j <= space; j++) {
                System.out.printf("%4s", ""); 
            }

            // numbers
            for (int j = 1; j <= patternWidth; j++) {
                
                    System.out.printf("%4s", "*");
            }

            space++;
            patternWidth -=2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number Of Rows: ");
        int n = sc.nextInt();
        printPattern(n);
    }
}

