import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr={6,3,8,9,3,1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubblesort(int[] arr){

        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    private static void swap(int[] arr,int i, int i1) {
        int temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;


    }
}
