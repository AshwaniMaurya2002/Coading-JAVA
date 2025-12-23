
import java.util.Random;

class RandomClass {
    public static void main(String[] args) {
        Random r = new Random();
        // printing random integer from -2147483648 to 2147483647
        int randomNumber = r.nextInt();
        System.out.println("Random Number: " + randomNumber);

    }
}