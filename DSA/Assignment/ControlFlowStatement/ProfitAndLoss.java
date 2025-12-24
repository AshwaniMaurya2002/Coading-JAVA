import java.util.Scanner;
public class ProfitAndLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SP, CP;
        SP = sc.nextInt();
        CP = sc.nextInt();
        if (SP > CP) {
            System.out.println("Profit %" + (SP - CP) * 100 / CP);
        } else if (CP > SP) {
            System.out.println("Loss %" + (CP - SP) * 100 / CP);
        } else {
            System.out.println("No Profit No Loss");
        }
    }
}
