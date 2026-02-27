public class MergeSort {
    
    public static void divide(int[] a,int start,int end){

        if(start<end){
            int mid=start+(end-start)/2;
            divide(a, start, mid);
            divide(a, mid+1, end);
            merge(int[] a,int start,int mid,int end);
        }

    }

    public static void merge() {
        
    }

    public static void main(String[] args) {
        
    }

}
