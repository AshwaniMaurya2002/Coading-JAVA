
public class NonStaticBlock {
    static int count = 0;
    // static is used because if it is non static then every time you create a
    // object it initalize with 0
    // and always give 1 but if you use static then then it assign to the same value
    // and counter upated properly
    {
        System.out.println("i am the non static block");

    }

    {

        count++;
        System.out.println(count);
        count=50;
    }

    public static void main(String[] args) {
        NonStaticBlock n = new NonStaticBlock();
        NonStaticBlock n1 = new NonStaticBlock();
        NonStaticBlock n2 = new NonStaticBlock();
        NonStaticBlock w1 = new NonStaticBlock();
        NonStaticBlock r1 = new NonStaticBlock();

    }

    static {
        System.out.println(" i am the static block");
    }
}
