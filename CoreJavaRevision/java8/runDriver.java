public class runDriver implements Runnable {

    @Override
    public void run() {
        System.out.println("runnnable");
    }
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("running is working");
        });
        t.start();
    }

}
