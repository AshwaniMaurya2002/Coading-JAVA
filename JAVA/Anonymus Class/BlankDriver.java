abstract class BlankDriver extends Blank {
    public static void main(String[] args) {
        BlankDriver b = new BlankDriver() {
            @Override
            void start() {
                System.out.println("Start method implemented in anonymous class.");
            }
        };

        b.start(); // calling the method
    }
}

abstract class Blank {
    abstract void start();
}