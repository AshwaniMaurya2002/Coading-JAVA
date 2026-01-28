public class printRightToLeft {

    public static void printDigit(int n){
        if(n<=0){
            return;
            
        }

        System.out.println(n%10);
        printDigit(n/10);
    }

    public static void main(String[] args) {
        
     printDigit(3472);


    }
    
}
