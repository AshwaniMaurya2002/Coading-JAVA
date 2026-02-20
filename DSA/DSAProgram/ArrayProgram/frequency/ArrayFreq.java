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

        /*
       ? if i is given
       * index= i+min;

       ?if value is given
       * index=value-min;

        */


        int[] freq=new int[max-min+1];

       
        for (int i : freq) {
            freq[i-min]++;
        }

        System.out.println(Arrays.toString(freq));

    }


    public static void main(String[] args) {
        
int [] a={12,1,2,12,12,53,43,53,34};
frequency(a);


    }
}
