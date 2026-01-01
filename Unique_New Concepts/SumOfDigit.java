public class SumOfDigit {
    public static void main(String[] args) {
        int n = 534562;
        System.out.println("Digit Sum Is: " + ((n != 0 && n % 9 == 0) ? 9 : n % 9));
    }
}
