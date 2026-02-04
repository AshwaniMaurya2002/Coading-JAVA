import java.util.Scanner;
public class printFactor {
    public static void printFactorAll(int n){ 
int count=0;
        for (int i = 1; i*i < n; i++) {
            if(n%i==0){
                int fact1=i;
                int fact2=n/i;
                if(fact1 !=fact2){
                    System.out.print(fact1 +" "+ fact2);
                    count+=2;
                }
                else{
                    System.out.print(fact1+" ");
                    count++;
                }
            }

            
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the Number Of For the Factors");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printFactorAll(n);
    }
    
}







