public class random4DigitOTP {
    public static void main(String[] args) {
        int min = 1000;
        int max = 10000;

        // 4digit otp ranges from 1000 to 9999 but 9999 is exclusive so we write 10000;


        while(true)
        {
            System.out.println(min + (int) (Math.random() * (max - min)));
        }
    }

}
