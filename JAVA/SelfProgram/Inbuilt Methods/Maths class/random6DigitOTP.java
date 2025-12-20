class random6DigitOTP {
    public static void main(String[] args) {

        while (true) {

            // this is used for any random number btwn 0 to 999999;
            int n = 6;
            System.out.println((int) (Math.random() * Math.pow(10, n)));
        }
    }
}