
class Q5 {

    public static void main(String[] args) {
        CircleDetails(7);
        CircleArea(7);
        CiclePerimeter(7);

    }

    public static void CircleDetails(int radius) {
        System.out.println("Radius of Circle: " + radius);

    }

    public static void CircleArea(int radius) {
        float area = 3.14f * radius * radius;
        System.out.println("Area of Circle: " + area);

    }

    public static void CiclePerimeter(int radius) {
        float perimeter = 2 * 3.14f * radius;
        System.out.println("Perimeter of Circle: " + perimeter);

    }

}
