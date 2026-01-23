import java.util.Scanner;

public class Q58 {

    public static void printPattern(int n) {
        // calculate no of iterations
        
     int space=n-1; int patterWidth=1;
     int num=1;
     for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=space; j++) {
            System.out.printf("  ");
            
        }
        for (int j = 1; j <=patterWidth; j++) {
            System.out.printf("% -4d", num--);
            
        }

        
        num=patterWidth+1;
        space--;
        patterWidth++;
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
