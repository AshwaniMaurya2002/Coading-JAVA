public class driver extends abstractInterface {

                @Override
                public void run() {
                                System.out.println("runnning");
                }

                public static void main(String[] args) {

                                driver d = new driver();
                                d.run();
                                System.out.println(d.x);

                }

}
