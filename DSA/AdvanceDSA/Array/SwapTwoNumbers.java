import java.util.Arrays;

public class SwapTwoNumbers {
    public static void swap(int[] p,int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }


    
    public static void main(String[] args) { 
        int[] a={10,20,30,40,50};
        int i=1;
        int j=3;
        swap(a, i, j);
        System.out.println(Arrays.toString(a));
    }
}
