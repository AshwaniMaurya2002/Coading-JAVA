import java.util.Scanner;

public class Q181 {

    public static void printPattern(int n) {

        int space=1;
        int patternWidth = n;
       int mid=(n/2)+1;

        for (int i = 1; i <= n; i++) {

             for (int j = 1; j <= space; j++) {
                
                    System.out.printf("  ");
            }


            // numbers
            for (int j = 1; j <= patternWidth; j++) {
                
                    System.out.printf("* ");
            }

           if(i<mid){
            space++;
            patternWidth-=2;
           }
           else{
            space--;
            patternWidth+=2;
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
