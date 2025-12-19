
class returnTotalSum {

    public static int getSum(int a, int b) {

        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int a = 43, b = 22;
        int n1 = 22, n2 = 532;
        // int sum1 = getSum(4, 5);

        // int sum2 = getSum(a, b);
        // int sum3 = getSum(n1, n2);

        System.out.println("total sum is :" + (getSum(4, 5) + getSum(a, b) + getSum(n1, n2)));

    }
}
