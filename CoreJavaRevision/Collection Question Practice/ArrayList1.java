
import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList();

        list.add(12);
        list.add(53);
        list.add(532);
        list.add(55);
        list.add(23);
//         Iterator<Integer> it = list.iterator();

//         while (it.hasNext()) {
//             System.out.println(it.next());
//         }
//         System.out.println(Collections.max(list));
//         int sum = 0;
//         int count = 0;
//         Iterator<Integer> it = list.iterator();
//         while (it.hasNext()) {
//             Integer elem = it.next();
//             sum += elem;
//             count++;
//         }
//         System.out.println(sum);
//         System.out.println(sum / count);
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (Integer l : list) {
            if (l > largest) {
                second = largest;
                largest = l;

            }

        }
        System.out.println(second);

    }

}
