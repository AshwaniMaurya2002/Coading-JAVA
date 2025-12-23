public class secondLargest {
    public static void main(String[] args) {
        int a = 10; // first number
        int b = 20; // second number
        int c = 15; // third number

        // String result = (a > b && a > c) ? (b > c ? "Second Largest is " + b : "Second Largest is " + c)
        //         : (b > a && b > c) ? (a > c ? "Second Largest is " + a : "Second Largest is " + c)
        //         : (a > b ? "Second Largest is " + a : "Second Largest is " + b);

        // System.out.println(result);


        // alternative approach
        int sum = a + b + c;
        int min= a<b ? (a<c ? a : c) : (b<c ? b : c);
        int max= a>b ? (a>c ? a : c) : (b>c ? b : c);
        int secondLargest = sum - (min + max);
        System.out.println("Second Largest is: " + secondLargest);
    }
}
