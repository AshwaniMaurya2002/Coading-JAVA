
import java.util.Arrays;
import java.util.List;

public class streamapi {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 25, 30, 45, 50, 65);

//         numbers.stream().filter(n -> n > 40).forEach(System.out::println);
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::print);
    }
}
