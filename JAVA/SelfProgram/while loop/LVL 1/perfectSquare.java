public class perfectSquare {
    public static void main(String[] args) {
        int i = 1;
        while (i * i <= 100) {
            System.out.println(i * i);
            i++;
        }
        System.out.println(i - 1 + " perfect squares are there between 1 to 100");
    }
}
