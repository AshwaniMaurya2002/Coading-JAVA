
import java.util.Arrays;

public class Q6 {


    public  static  void getSum(int[] a){
        int sum=0;
        for(int s:a){
            sum+=s;
        }

        System.out.println(sum);

        for(int i=0;i<a.length;i++){
            a[i]=sum-a[i];
        }

        System.out.println("The new Array is"+ Arrays.toString(a));

    }

    public static void main(String[] args) {

        int[] a={1,3,2,4,5,2};

        getSum(a);
        
    }
    
}
