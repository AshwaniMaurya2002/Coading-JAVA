import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Compa implements Comparable<Compa> {
                int id;
                String name;

                public Compa() {
                }

                public Compa(int id, String name) {
                                this.id = id;
                                this.name = name;
                }

                @Override
                public int compareTo(Compa o) {
                                return this.id - o.id;
                }

                @Override
                public String toString() {
                                return name + " (" + id + ")";
                }

                public class Main {
                }

                public static void main(String[] args) {

                                List<Compa> list = new ArrayList<>();

                                list.add(new Compa(3, "Rahul"));
                                list.add(new Compa(1, "Amit"));
                                list.add(new Compa(2, "Neha"));

                                System.out.println("Before Sorting:");
                                System.out.println(list);

                                Collections.sort(list); // Uses compareTo()

                                System.out.println("After Sorting:");
                                System.out.println(list);
                }
}