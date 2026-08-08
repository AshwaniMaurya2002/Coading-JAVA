
public class syncDriver {

    public static void main(String[] args) throws InterruptedException {

        syncBlock s = new syncBlock();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                s.increment();

            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                s.increment();

            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(s.count);

    }

}
