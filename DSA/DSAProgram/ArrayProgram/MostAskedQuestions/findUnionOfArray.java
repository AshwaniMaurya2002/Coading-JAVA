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
        
    }

}
