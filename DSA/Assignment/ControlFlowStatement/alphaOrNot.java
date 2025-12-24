
import java.util.Scanner;

public class alphaOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input a character from user
        // there is no char input method in scanner class so we will take string input
        // and then convert it to char
        char ch = sc.next().charAt(0);
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an alphabet");
        } else {
            System.out.println(ch + " is not an alphabet");
        }
    }
}
