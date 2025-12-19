
class Q3 {

    public static void main(String[] args) {
        PercentageProfit(1000, 10);
        PercentageProfit(2000, 25);
        PercentageProfit(5000, 50);

    }

    public static void PercentageProfit(double costPrice, double profitPercentage) {
        double profitAmount = (costPrice * profitPercentage) / 100;
        double sellingPrice = costPrice + profitAmount;
        System.out.println("CostPrice " + costPrice + "  after " + profitPercentage + "% Profit is: " + sellingPrice);
        {

        }

    }
}
