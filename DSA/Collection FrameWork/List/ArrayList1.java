
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ArrayList1 {
    
    public static void main(String[] args) {
        
        List<Integer> l=new ArrayList<>();

        l.add(53);
        l.add(12);
        l.add(234);
        l.add(31);
        l.add(32);


        // l.sort((a,b)->b-a)
        l.sort(ComparatorInt);)
        System.out.println(l);


        
    }
   }
