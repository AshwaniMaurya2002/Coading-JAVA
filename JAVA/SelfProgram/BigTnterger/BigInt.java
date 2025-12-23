import java.math.BigInteger;
public class BigInt {

    public static void main(String[] args) {
        BigInteger bigNumber = new BigInteger("123456789012345678901234567890");
        BigInteger anotherBigNumber = new BigInteger("987654321098765432109876543210");

        BigInteger sum = bigNumber.add(anotherBigNumber);
        System.out.println("Sum: " + sum);
        BigInteger product = bigNumber.multiply(anotherBigNumber);
        System.out.println("Product: " + product);

        BigInteger power = bigNumber.pow(253);
        System.out.println("Power: " + power);
        BigInteger gcd = bigNumber.gcd(anotherBigNumber);
        System.out.println("GCD: " + gcd);

        BigInteger modInverse = bigNumber.modInverse(new BigInteger("1000000007"));
        System.out.println("Modular Inverse: " + modInverse);
        //mod Inverse can be calculated only if bigNumber and modulus are coprime.

        


        
    }


    
}
