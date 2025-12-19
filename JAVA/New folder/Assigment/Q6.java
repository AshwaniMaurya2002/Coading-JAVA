
class Q6 {

    public static void main(String[] args) {
        SquareDetails(6);
        SquareArea(6);
        SquarePerimeter(6);
    }

    public static void SquareDetails(int side) {
        System.out.println("Side of Square: " + side);
    }

    public static void SquareArea(int side) {
        int area = side * side;
        System.out.println("Area of Square: " + area);
    }

    public static void SquarePerimeter(int side) {
        int perimeter = 4 * side;
        System.out.println("Perimeter of Square: " + perimeter);
    }
}
