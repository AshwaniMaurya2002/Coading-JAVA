public class DiffOfBigSmall {
    public static void main(String[] args) {
        int number = 43705;
        int max = -1;
        int min = 10;
        while (number > 0) {
            int digit = number % 10;
            if (digit > max) {
                max = digit;
            }
            if (digit < min) {
                min = digit;
            }
            number = number / 10;
        }
        System.out.println(max - min);
    }
}