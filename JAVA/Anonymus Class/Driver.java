



public class Driver {
    public static void main(String[] args) {

        Maths b = new Maths() {
            @Override
            public void get() {
                System.out.println("Start method implemented in anonymous class.");
            }
        };

        b.get(); // calling method
    }
}