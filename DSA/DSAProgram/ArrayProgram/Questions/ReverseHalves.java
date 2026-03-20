public class ReverseHalves {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int n = arr.length;

        // Reverse first half
        for (int i = 0, j = n/2; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

     
        for (int i = (n/2) + 1, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}