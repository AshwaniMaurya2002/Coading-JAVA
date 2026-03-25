import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class findUnionOfArray {
    
    public static int[] unionOfArray(int[]a,int[] b){

        Set<Integer> union=new HashSet<>();

        for (Integer integer : a) {
            union.add(integer);
            
        }
        for (Integer integer : b) {
            union.add(integer);
            
        }
        int[] result=new int[union.size()];
        int i=0;
        for (Integer integer : union) {
            result[i++]=integer;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,1,3,4,5};
        int[] b={4,5,6,7,52,1,8};
        int[] result=unionOfArray(a, b);
        System.out.println(Arrays.toString(result));
    }

}
