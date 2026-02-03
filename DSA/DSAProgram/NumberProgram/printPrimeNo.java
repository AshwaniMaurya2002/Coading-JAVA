
import java.util.Scanner;

public class printPrimeNo {

    public static boolean  printPrime(int n){
        if(n<2){
            return false;
        }
        else if(n==2||n==3){
            return true;
        }
       for(int i=3;i*i<=n;i+=2){
        if(n%i==0){
            return false;
        }
       }

       return true;
    }

    public static void main(String[] args) {


        System.out.println("Enter the number");
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();

    boolean ans=printPrime(n);
    System.out.println(ans);

    }
    
}
