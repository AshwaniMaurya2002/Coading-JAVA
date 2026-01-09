public class Pattern10 {
    public static void main(String[] args) {

        int n = 0;
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                // System.out.print(n);
                // if(n==0)
                // {
                // n=1;

                // }
                // else{
                // n=0;
                // }

                // logic 2
                if ((i + j) % 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }

            }
            System.out.println();

        }
    }
}
