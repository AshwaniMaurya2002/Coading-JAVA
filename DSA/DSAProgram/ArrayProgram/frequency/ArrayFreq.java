import java.util.Arrays;

public class ArrayFreq {

    public static  void frequency(int[] a){
        int n=a.length;
        int max=a[0];
        int min=a[0];

        for (int i : a) {
            
            if(i>max)
                max=i;
            else if(i<min)
                min=i;
        }

        int[] freq=new int[max-min+1];

       
        for (int i : a) {
            freq[i-min]++;
        }
        System.out.println(Arrays.toString(freq));

    }


    public static void main(String[] args) {
        
int [] a={8,10,8,11,10,11,12,11,12,11,8};
frequency(a);


    }
}
