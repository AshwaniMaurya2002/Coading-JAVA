import java.util.Scanner;

public class Q200 {

    public static void printPattern(int n) {

        int sStar=1;
        int eStar=n;
        int mid=(n/2)+1;
        


        for (int i = 1; i <= n; i++) {

             for (int j = 1; j <= n; j++) {
                
                    if(j<=sStar||j>=eStar){
                        System.out.print("* ");
                    }
                    else{
                            System.out.print("  ");
                    }
                }

           if(i<mid){
            sStar++;
            eStar--;
           }
           else{
           sStar--;
           eStar++;
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
