public class Patter8 {
    public static void main(String[] args) {

        int n = 10;

        for (int i = 0; i <= n; i++) {
            //for space
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");

            }
            //for star
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

            
        }
    }
}
