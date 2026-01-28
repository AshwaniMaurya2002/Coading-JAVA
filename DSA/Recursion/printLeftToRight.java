public class printLeftToRight {

    public static void printDigit(int n){
        if(n<=0){
            return;
            
        }

        printDigit(n/10);
        System.out.println(n%10);
    }

    public static void main(String[] args) {
        
     printDigit(3472);


    }
    
}
