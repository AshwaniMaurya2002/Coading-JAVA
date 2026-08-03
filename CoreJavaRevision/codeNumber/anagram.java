
import java.util.Arrays;

public class anagram {

                public static boolean checkAnagram(String x, String y) {

                                char[] a = x.toCharArray();
                                char[] b = y.toCharArray();

                                Arrays.sort(a);
                                Arrays.sort(b);

                                if (Arrays.equals(a, b)) {
                                                return true;
                                }

                                else
                                                return false;

                }

                public static void main(String[] args) {
                                boolean res = checkAnagram("abcd", "deca");
                                System.out.println(res);
                }
}
