import java.util.Arrays;
public class SwapTwoArray {
public static void swap(int[] a ,int[] b )
{
    int[] temp=a;
    a=b;
    b=temp;
}
public static void main(String[] args) {
    int[] a={10,20,30,40,50};
    int[] b={8,7,6,5,4,3,2,1};
        swap(a,b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
}
}
