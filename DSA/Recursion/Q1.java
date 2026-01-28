public class Q1 {


    public static void printNO(int n){
        if(n==0){
            return;

        }

        printNO(n-1);
        System.out.println(n);

    }


    public static void main(String[] args) {
     printNO(10);

    }
    
}
