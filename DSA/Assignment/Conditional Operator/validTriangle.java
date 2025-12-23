public class validTriangle {
    public static void main(String[] args) {
        int a = 3; // side 1
        int b = 4; // side 2
        int c = 5; // side 3

        String result = (a + b > c && a + c > b && b + c > a) ? "Valid Triangle" : "Invalid Triangle";
        System.out.println(result);                                                             
    }
}
