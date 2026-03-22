import java.util.Arrays;

public class moveNegativeaToLeft {

    public static void move(int[] a){
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
    }


    public static void main(String[] args) {
        int[] a={12,-12,23,2,4,-1,-53,5};
        move(a);
        System.out.println(Arrays.toString(a));

    }
    
}
