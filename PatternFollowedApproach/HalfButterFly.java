
import java.util.Scanner;

public class HalfButterFly {

    public static void printPattern(int n) {
        int mid=n/2+1;
        int patternWidth = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= patternWidth; j++) {
                System.out.print("* ");
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

        System.out.println("Enter the no of rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);

    }
}
