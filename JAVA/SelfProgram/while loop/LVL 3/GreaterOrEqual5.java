
public class GreaterOrEqual5 {
    public static void main(String[] args) {
        int number = 43705;
        while (number > 0) {
            int digit = number % 10;
            if (digit >= 5) {
                System.out.println(digit);
            }
            number = number / 10;
        }
    }
}
