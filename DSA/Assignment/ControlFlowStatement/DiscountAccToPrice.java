import java.util.Scanner;

public class DiscountAccToPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        if (price > 10000) {
            System.out.println("Discount is 40%");
        } else if (price > 6000) {
            System.out.println("Discount is 30%");
        } else if (price >= 3000) {
            System.out.println("Discount is 20%");
        } else {
            System.out.println("No Discount");
        }
    }
}
