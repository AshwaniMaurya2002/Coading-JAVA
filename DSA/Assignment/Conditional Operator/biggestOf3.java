public class biggestOf3 {
    public static void main(String[] args) {
        int a = 10; // first number
        int b = 20; // second number
        int c = 15; // third number

        int biggest = (a >= b && a >= c) ? a : (b >= a && b >= c) ? b : c;

        System.out.println("The biggest number is: " + biggest);

        // case 2 using ternary operator
        int biggest2 = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("The biggest number using alternative method is: " + biggest2);

        // case 3 using ternary operator
        int biggest3 = Math.max(a, Math.max(b, c));
        System.out.println("The biggest number using Math.max is: " + biggest3);

    }
}
