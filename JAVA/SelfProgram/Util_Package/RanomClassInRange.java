import java.util.Random;

public class RanomClassInRange {

    public static void main(String[] args) {
        Random r=new Random();
        // printing random integer from 0 to 99
        int randomNumbber=r.nextInt(100);
        System.out.println("Random Number in Range 0 to 99: "+randomNumbber);
    }
    
}
