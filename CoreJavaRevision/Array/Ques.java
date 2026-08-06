
import java.util.Arrays;

public class Ques {

    public static void rotateOne(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
        
            

        }
        arr[0] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotateOne(arr);

        System.out.println(Arrays.toString(arr));

    }
}
