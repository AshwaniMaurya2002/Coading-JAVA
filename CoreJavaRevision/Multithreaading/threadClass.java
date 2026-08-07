
public class threadClass extends Thread {

    @Override
    public void run() {
        System.out.println("running the run");
    }

    public static void main(String[] args) {
        System.out.println("main running");
        threadClass t = new threadClass();
        t.start();
    }
}
