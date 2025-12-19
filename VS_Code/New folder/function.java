
import java.util.*;

class function {

    public static void main(String[] args) {

        // List<String> names = new ArrayList<>();
        // names.add("Alice");
        // names.add("Bob");
        // names.add("Charlie");
        // for (String abc : names) {
        //     System.out.println(a4bc);
        // }
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(sc.nextInt());
        }

        for (Integer num : numbers) {

            System.out.print(" " + num);
        }
        Collections.sort(numbers);
        System.out.println();
        System.out.println("After Sorting:");
        for (Integer num : numbers) {

            System.out.print(" " + num);
        }

    }
}
