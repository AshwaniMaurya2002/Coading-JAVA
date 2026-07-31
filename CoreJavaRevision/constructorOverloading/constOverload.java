public class constOverload {

                public constOverload() {
                                System.out.println("no parameter");
                }

                constOverload(int x, int y) {
                                System.out.println(x);
                }

                constOverload(int x, int y, int z) {
                                System.out.println(x);
                                System.out.println(y);
                }

                constOverload(String x, String y) {
                                System.out.println("strinf const" + x);
                }

                public void name() {
                                System.out.println("hello my name is");
                }

}
