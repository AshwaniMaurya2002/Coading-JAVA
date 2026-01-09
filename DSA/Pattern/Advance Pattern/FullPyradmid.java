public class FullPyradmid {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {

            // for (int j = 1; j <= n - i; j++) {
            // System.out.print(" ");
            // }
            // for (int j = 1; j < i; j++) {
            // System.out.print("* ");
            // }
            // for (int j = 1; j <= i; j++) {
            // System.out.print("* ");
            // }
            // for (int j = 1; j <= n - i; j++) {
            // System.out.print(" ");
            // }

            // logic 2

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < +2 * i - 1; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

    }
}
