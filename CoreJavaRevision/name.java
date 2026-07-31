public class name extends abstractClass {

                @Override
                public void hello() {
                                System.out.println("hellooo");
                }

                @Override
                public int sum() {
                                return 1;
                }

                public static void main(String[] args) {
                                name n = new name();
                                n.hello();
                                System.out.println(n.sum());
                                name.good();
                }

}
