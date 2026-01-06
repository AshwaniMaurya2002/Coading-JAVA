
public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("I am the main method");
    }

    static {
        System.out.println(" I am the static block");

    }

    static {
        System.out.println(" I am the static block2");

    }

    static {
        System.out.println(" I am the static block3");

    }

    // static block always execute at the time of loading process
}
