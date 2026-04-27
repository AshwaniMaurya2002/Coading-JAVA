public class Driver {

    public static void main(String[] args) {
        
        Lambda add = (a, b) -> a + b;

        System.out.println(add.get(10, 20)); // Output: 30
    }
}