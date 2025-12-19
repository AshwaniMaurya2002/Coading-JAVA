
public class printNumeberLR {

    public static void main(String[] args) {

        int n = 57843433;

        // important concept to change number into string to find the string length
        int digit = (n + "").length();
        while (n > 0) {
            System.out.println(n / (int) (Math.pow(10, digit - 1)) % 10);
            digit--;
        }
    }

}
