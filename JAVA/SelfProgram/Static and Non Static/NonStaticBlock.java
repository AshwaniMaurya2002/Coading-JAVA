
public class NonStaticBlock {
    static  int count = 0;

    {
        System.out.println("i am the non static block");

    }

    {

        count++;
        System.out.println(count);
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
