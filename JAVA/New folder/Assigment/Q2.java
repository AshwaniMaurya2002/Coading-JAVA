
class Q2 {

    public static void main(String[] args) {
        DiscountPrice(1000, 10);
        DiscountPrice(2000, 25);
        DiscountPrice(5000, 50);

    }

    public static void DiscountPrice(int price, int discount) {
        int discountAmount = (price * discount) / 100;
        int finalPrice = price - discountAmount;
        System.out.println(" Price after " + discount + "% Discount is: " + finalPrice);
        {

        }

    }
}
