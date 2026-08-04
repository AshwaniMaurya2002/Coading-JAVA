
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Que4 {

                public static void main(String[] args) {
                                List<Integer> arr = new ArrayList<>();
                                arr.add(10);
                                arr.add(20);

                                Collections.addAll(arr, 12, 3, 432, 234, 523, 53255, 324, 4);

                                Iterator<Integer> it = arr.iterator();

                                for (Integer i : arr) {
                                                if (i % 2 == 0)
                                                                arr.remove(i);
                                }

                }

}
