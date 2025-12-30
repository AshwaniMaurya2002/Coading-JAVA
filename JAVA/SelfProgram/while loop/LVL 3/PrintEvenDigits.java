
import java.util.Scanner;


public class PrintEvenDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt() ;
        while(number>0){
            int digit=number%10;
            if(digit%2==0){
                System.out.println(digit);
            }
            number=number/10;
        }
    }
    
}
