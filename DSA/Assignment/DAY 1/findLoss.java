public class findLoss {

    public static int lossPercentage(int cp, int sp) {
        int result = (cp-sp) * 100 / cp;
        return result;
    }

    public static void main(String[] args) {
        int cp = 160, sp = 120;

        int result = lossPercentage(cp, sp);
        System.out.println(result);

    }
    
}
