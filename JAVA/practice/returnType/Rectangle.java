
public class Rectangle {

    static int length, breath;

    public static void setValue(int l, int b) {
        length = l;
        breath = b;
    }

    public static String getValue() {
        return ("The length is : " + length) + ("\nThe breadth is : " + breath);

    }

    public static int getArea() {
        return length * breath;
    }

    public static int getPerimeter() {
        return 2 * (length + breath);
    }

    public static void main(String[] args) {
        setValue(12, 31);
        System.out.println(getValue());
        System.out.println("The Perimeter is :- " + getPerimeter());
        System.out.println("The Area is :- " + getArea());

    }

}
