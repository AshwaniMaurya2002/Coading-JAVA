

public class MaxNumber {
    public static void main(String[] args) {
        int number = 43705;
        int max = -1;
        while (number > 0) {
            int digit = number % 10;
            if (digit > max) {
                max = digit;
            }
            number = number / 10;
        }
        System.out.println(max);
    }
    
}
