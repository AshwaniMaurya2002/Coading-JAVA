import java.util.Arrays;

public class SelectoinSort {
    
    public static void Selection(int[] a){

        int n=a.length;
        for (int i = 0; i <n-1; i++) {
            int minIndex=i, minValue=a[i];
            for (int j = i+1; j < n; j++) {
                if(a[i]<minValue){
                    minIndex=j;
                    minValue=a[j];
                }


                
            }

            // this is used For swapping;
            a[minIndex]=a[i];
            a[i]=minValue;
            
        }
    }


    public static void main(String[] args) {
        
        int[] a={12,1,3,23,52,7,9,0};
        System.out.println(Arrays.toString(a));
        Selection(a);
        System.out.println(Arrays.toString(a));



    }

}
