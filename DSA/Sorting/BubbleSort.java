import java.util.Arrays;

public class BubbleSort {
    

    public static void Bubble(int[] a){
        int n=a.length;

        for (int i = 0; i < n-1; i++) {
            boolean flag=true;
            for (int j = 0; j < n-1-i; j++) {

                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=false;
                }
                
            }
            if(flag)
                return;
            
        }

    }


    public static void main(String[] args) {
        int[] a={12,42,62,4,6,7,2,0};

        System.out.println(Arrays.toString(a));
        Bubble(a);
        System.out.println(Arrays.toString(a));


        
    }


}
