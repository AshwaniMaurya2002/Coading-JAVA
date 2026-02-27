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
        int indx1=start, indx2=mid+1, indx3=0;
        if(a[indx1]<a[indx2]){
            merged[indx3++]=a[indx1++];
        }else
            merged[indx3++]=a[indx2++];
        
        while(indx1<=mid){
            merged[indx3++]=a[indx1++];

        }
        while(indx2<=end){
            merged[indx3++]=a[indx2++];
            
        }

        
    }

    public static void main(String[] args) {
        
    }

}
