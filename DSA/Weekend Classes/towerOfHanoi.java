
import java.util.Scanner;


class  towerOfHanoi{

    static int count=0;
    public static void toh(int n,char from,char aux,char to){
        count++;

        if(n==1){
            System.out.println("Move Disk " +from+" to "+to);
            return;
        }
        toh(n-1,from,to,aux);
        System.out.println("Move Disk "+from+" to"+aux);
        toh(n-1, to,from,aux);

    }


    public static void main(String[] args) {
        System.out.println("Enter the NUmber of Disks");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        toh(n,'A','B','C');
        System.out.println("the total no of counts to solve problem is  ----->"+ count);
        
    }
}