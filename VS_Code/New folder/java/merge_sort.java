
import java.util.Arrays;

public class merge_sort {

    public static void main(String[] args) {
        int[] arr = {9, 4, 6, 2, 1, 5};
        divide(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));

    }

    static void divide(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }

        int mid = s + (e - s) / 2;
        divide(arr, s, mid);
        divide(arr, mid + 1, e);
        conquer(arr, s, mid, e);

    }

    private static void conquer(int[] arr, int s, int mid, int e) {
        int[] merged = new int[e - s + 1];
        int idx1 = s;
        int idx2 = mid + 1;
        int idx3 = 0;
        merged = new int[e - s + 1];
        while (idx1 <= mid && idx2 <= e) {
            if (arr[idx1] <= arr[idx2]) {
                merged[idx3] = arr[idx1];
                idx1++;
            } else {
                merged[idx3] = arr[idx2];
                idx2++;
            }
            idx3++;
        }
        while (idx1 <= mid) {
            merged[idx3] = arr[idx1];
            idx1++;
            idx3++;
        }

        while (idx2 <= e) {
            merged[idx3] = arr[idx2];
            idx3++;
            idx2++;
        }

        for (int i = 0, j = s; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

}
