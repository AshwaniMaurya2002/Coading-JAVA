
import java.util.HashMap;

public class countFreq {

    public static void countEachFreq(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i : map.keySet()) {
                System.out.println(i+" -->"+map.get(i));

        }

    }

    public static void main(String[] args) {

                int[] arr={1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
                countEachFreq(arr);

    }
}
