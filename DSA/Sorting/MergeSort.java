
import java.util.Arrays;
public class MergeSort {

    public static void divide(int[] a, int start, int end) {

        if (start < end) {
            int mid = start + (end - start) / 2;
            divide(a, start, mid);
            divide(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }

    public static void merge(int[] a, int start, int mid, int end) {
        int[] merged = new int[end - start + 1];
        int indx1 = start, indx2 = mid + 1, indx3 = 0;
        while(indx1<=mid&&indx2<=end){
            if (a[indx1] < a[indx2]) {
            merged[indx3++] = a[indx1++];
        } else
            merged[indx3++] = a[indx2++];

        }
        while (indx1 <= mid) {
            merged[indx3++] = a[indx1++];

        }
        while (indx2 <= end) {
            merged[indx3++] = a[indx2++];

        }

        //i is 0 so itis used for merged array
        for (int i = 0, j = start; i < merged.length; i++, j++) {
            a[j]=merged[i];
        }
    }

    public static void main(String[] args) {
        int[] a = { 34, 25, 2, 5, 36, 0, 3, 2, 4, 5, 66, 453, 8, 53, 532, 634, 92 };
        System.out.println(Arrays.toString(a));
        divide(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

    }

}
