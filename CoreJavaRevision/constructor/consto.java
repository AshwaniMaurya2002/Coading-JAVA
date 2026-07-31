public class consto {

                consto() {
                                System.out.println("const runs");

                }

                int x = 20;

                public void run() {
                                int x = 10;
                                System.out.println("run");
                                System.out.println(this.x);

                }

                public static void main(String[] args) {
                                consto c = new consto();
                                c.run();
                }
}
