import java.util.*;

public class Main {
                public static void main(String[] args) {

                                List<String> list = new ArrayList<>();

                                list.add("Java");
                                list.add("Spring");
                                list.add("React");

                                list.set(1, "python");

                                System.out.println(list.get(0));
                                System.out.println(list.get(list.size() - 1));
                                System.out.println(list.size());
                                System.out.println(list.contains("Java"));
                }
}