public class Q2 {


    public static void printNO(int n){
        if(n==0){
            return ;

        }
        
        System.out.println(n);
        printNO(n-1);

    }


    public static void main(String[] args) {
        
    printNO(10);
    }
    
    
}
