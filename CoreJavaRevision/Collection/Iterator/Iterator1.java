
import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

                public static void main(String[] args) {
                                ArrayList<Integer> arr = new ArrayList<>();
                                arr.add(12);
                                arr.add(122);
                                arr.add(1342);
                                arr.add(1223);
                                arr.add(1232425);

                                // for (int i = 0; i < arr.size(); i++) {
                                // System.out.println(arr.get(i));
                                // }

                                // for (Integer elem : arr) {
                                // System.out.println(elem);

                                // }

                                // Iterator<Integer> it = arr.iterator();

                                // while (it.hasNext()) {
                                // System.out.println("---------" + it.next());

                                // }

                                // ListIterator<Integer> it = arr.listIterator();

                                // while (it.hasNext()) {
                                // System.out.println(it.next());
                                // }

                                // arr.forEach(System.out::println);
                                // arr.forEach(z -> System.out.println(z));
                                Iterator<Integer> it = arr.iterator();
                                while (it.hasNext()) {
                                                int id = it.next();
                                                if (id == 122) {
                                                                it.remove();
                                                }

                                }

                                System.out.println(arr);

                }
}
