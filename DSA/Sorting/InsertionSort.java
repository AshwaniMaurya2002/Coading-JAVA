
import java.util.Arrays;

public class InsertionSort {

    public static void Insert(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int pivot = a[i];
            while (j >= 0 && a[j] > pivot) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = pivot;
        }
    }

    public static void main(String[] args) {
        
        int [] a={1,52,535,234,3,23,5,66,46,34,76};
        Insert(a);
        System.out.println(Arrays.toString(a));
    }


}
