import java.util.Scanner;

public class Q230 {

    public static void printPattern(int n) {

       
       int space=n-1;

        for (int i = 1; i <= n; i++) {
            int patternWidth=2*i-1;
 int mid=(patternWidth/2)+1;

             for (int j = 1; j <= space; j++) {
                System.out.print("  ");
                  
                }

                for (int j = 1; j <= patternWidth; j++) {
                if(j==1||j==(2*i-1)||i==n||j==mid)//using to print last stars
                  System.out.print("* ");

                else
                    System.out.print("  ");
                }
                
                space--;
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
