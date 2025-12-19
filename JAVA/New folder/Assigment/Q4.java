
class Q4 {

    public static void main(String[] args) {
        RectangleDetails(10, 5);
        RectangleArea(10, 5);
        RectanglePerimeter(10, 5);

    }

    public static void RectangleDetails(int length, int breadth) {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }

    public static void RectangleArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public static void RectanglePerimeter(int length, int breadth) {
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }

}
