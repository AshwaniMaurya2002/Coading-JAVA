public class Q10Pattern {

    // 1 ∗ 2 + 2 ∗ 3 + 3 ∗ 4 ... ... upto 100 terms
    public static int sum(int n) {
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum += i * (i + 1);
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of Pattern is : " + sum(100));
    }
}
