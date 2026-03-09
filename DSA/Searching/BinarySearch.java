public class BinarySearch {


    public static int binarySearch(int []a,int target,int start,int end){
        if(start>end)
            return -1;
        int mid=start+(end-start)/2;
        if(a[mid]==target)
            return mid;
        else if(a[mid]>target)
            return binarySearch(a, target, start, mid-1);
        else
            return  binarySearch(a, target, mid+1, end);
    }
    
    public static void main(String[] args) {

        int[] a={1,2,5,6,8,44,356,674,999};
    System.out.println(  binarySearch(a, 44, 0, a.length-1));        
    }
    
}
