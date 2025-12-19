public class randomRangeOfNumber {
    public static void main(String[] args) {
        int max = 70; // 70 is exclusive it does not count in the range
        int min = 30;

        while (true) {
            // this is the code used for printing a range of numbers where the max is
            // exclusive while min is inclusive
            int random = min + (int) ((Math.random()) * (max - min));
            System.out.println(random);
        }
    }

}
