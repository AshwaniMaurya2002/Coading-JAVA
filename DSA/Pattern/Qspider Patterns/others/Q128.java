import java.util.Scanner;

public class Q128 {

    public static void printPattern(int n) {

        
        int patternWidth = 1;
       int mid=(n/2)+1;

        for (int i = 1; i <= n; i++) {


            // numbers
            for (int j = 1; j <= patternWidth; j++) {
                
                    System.out.printf("* ");
            }

           if(i<mid){
            patternWidth++;
           }
           else{
            patternWidth--;
           }
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
