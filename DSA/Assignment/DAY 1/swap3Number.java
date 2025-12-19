
class swap3Number {

    public static void main(String[] args) {

        //without using 4th variable
        int a = 10, b = 40, c = 30;
        System.out.println(a + " " + b + " " + c);
        a = a + b + c;
        b = a - b - c;
        c = a - b - c;
        a = a - b - c;
        System.out.println(a + " " + b + " " + c);

        //with usong 4th value
        System.out.println(a + " " + b + " " + c);

        int temp = b;
        b = a;
        a = c;
        c = temp;

        System.out.println(a + " " + b + " " + c);

    }
}
