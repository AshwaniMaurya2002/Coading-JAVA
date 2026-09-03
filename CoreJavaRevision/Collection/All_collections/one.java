
import java.util.ArrayList;
import java.util.Iterator;

public class one {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(1532);
        arr.add(124);
        arr.add(1244);
        arr.add(1432);
        arr.add(1342);
        arr.add(12);
        
        Iterator it = arr.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
