public class biggerOfTwoNumber {
    public static void main(String[] args) {
        int a = 10; // You can change this value to test different numbers
        int b = 20; // You can change this value to test different numbers

        String result = (a > b) ? (a + " is bigger") : (b + " is bigger or they are equal");
        System.out.println(result);

        // Alternatively, using Math.max
        int bigger = Math.max(a, b);
        System.out.println("Bigger number using Math.max: " + bigger);


    }
}
