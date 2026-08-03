public class fib {

                public static int fibbonacci(int x) {

                                if (x == 0 || x == 1) {
                                                return x;
                                }

                                return fibbonacci(x - 1) + fibbonacci(x - 2);
                }

                public static void main(String[] args) {
                                System.out.println(fibbonacci(5));

                }
}
