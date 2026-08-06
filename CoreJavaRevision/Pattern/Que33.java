
public class Que33 {

    public static void main(String[] args) {
        int n = 7;
        int m = 1;
        int space = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < m; j++) {
                System.out.print("* ");
            }

            m++;
            space--;
            System.out.println();

        }
    }
}
