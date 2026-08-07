
public class runnableInterface implements Runnable {

    @Override
    public void run() {
        System.out.println("running");
    }

    public static void main(String[] args) {
        System.out.println("main is running");
        runnableInterface r = new runnableInterface();
        Thread t = new Thread(r);
        t.start();
    }
}
