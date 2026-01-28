public class digitCount  {
     static    int count=0;
    public static int printDigit(int n){
       
        if(n<=0){
            return 0;
            
        }

        
        printDigit(n/10);
        count++;
        return  count;
        
    }

    public static void main(String[] args) {
        
     int count=printDigit(3472324);
     System.out.println(count);


    }
    


    
}
