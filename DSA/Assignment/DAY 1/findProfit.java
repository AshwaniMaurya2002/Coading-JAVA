
public class findProfit {

    public static int profitPercentage(int cp, int sp) {
        int result = (sp - cp) * 100 / cp;
        return result;
    }

    public static void main(String[] args) {
        int cp = 120, sp = 160;

        int result = profitPercentage(cp, sp);
        System.out.println(result);

    }
}
