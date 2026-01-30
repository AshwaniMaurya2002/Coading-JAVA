import java.util.Scanner;

public class PatternByRows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows (must be odd): ");
        int rows = sc.nextInt();

        if (rows % 2 == 0) {
            System.out.println("Please enter an odd number of rows.");
        } else {
            printPattern(rows);
        }
        sc.close();
    }

    public static void printPattern(int rows) {
        int n = (rows + 1) / 2;   // middle number
        int size = rows;         // total rows = total cols

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {

                int top = row;
                int left = col;
                int right = size - 1 - col;
                int bottom = size - 1 - row;

                int minDist = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(n - minDist+" ");
            }
            System.out.println();
        }
    }
}
