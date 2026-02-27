public class MergeSort {
    
    public static void divide(int[] a,int start,int end){

        if(start<end){
            int mid=start+(end-start)/2;
            divide(a, start, mid);
            divide(a, mid+1, end);
            merge(a,start,mid,end);
        }

    }

    public static void merge(int[]a ,int start,int mid,int end) {
        int[] merged=new int[end-start+1];
        
        
    }

    public static void main(String[] args) {
        
    }

}
