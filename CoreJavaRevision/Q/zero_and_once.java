
import java.util.Arrays;

public class zero_and_once {

    public static int[] getSorted(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] == 0) {
                i++;
            } else if (arr[j] != 0) {
                j--;
            } else {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;

            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0};

        int[] ans = getSorted(arr);

        System.out.println(Arrays.toString(ans));

    }

}
