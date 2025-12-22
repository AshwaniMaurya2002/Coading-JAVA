import java.util.Random;
import java.util.Scanner;

public class check3DigitNO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r1 = new Random();
        int n = sc.nextInt();

        System.out.println(n > 100 && n < 999 ? "3 digit NO" : "Not a 3 digit Number");
    }

}
