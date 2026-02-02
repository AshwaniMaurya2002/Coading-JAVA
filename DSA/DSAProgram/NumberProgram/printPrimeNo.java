public class printPrimeNo {

    public static boolean  printPrime(int n){
        if(n<2){
            return false;
        }
        else if(n==2||n==3){
            return true;
        }
       else if(n%2==0){
        return  false;
       }

       return true;
    }

    public static void main(String[] args) {

    System.out.println(     printPrime(25));

    }
    
}
