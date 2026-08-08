
class rcDriver {

    public static void main(String[] args) throws Exception {
        raceCondition rc = new raceCondition();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                rc.increment();

            }

        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                rc.increment();

            }

        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(rc.count);

    }
}
