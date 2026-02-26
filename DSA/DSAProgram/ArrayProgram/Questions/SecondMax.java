public class SecondMax {
    public static int secondMax(int[] a){
        long max=Long.MIN_VALUE;
        long secondMax=Long.MIN_VALUE;

        for (int i : a) {
            if(i>max){
                secondMax=max;
                max=i;
            }else if(i<max&& i>secondMax){
                secondMax=i;
            }
        }
        return secondMax!=Long.MIN_VALUE?(int)secondMax:(int)max;
    }

    public static void main(String[] args) {

        int[] a={12,2,4,24,2,5,63,63,637,231,425,1000,1004,10002};
       System.out.println( secondMax(a));
        
        
    }
    
}
