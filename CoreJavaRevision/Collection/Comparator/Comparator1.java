
import java.util.Comparator;

public class Comparator1 implements Comparator<Comparator1> {

                int id;
                String name;
                double rollNo;

                public Comparator1() {
                }

                public Comparator1(int id, String name, double rollNo) {
                                this.id = id;
                                this.name = name;
                                this.rollNo = rollNo;
                }

                @Override
                public String toString() {
                                return id + " " + name + " " + rollNo;
                }

                @Override
                public int compare(Comparator1 s1, Comparator1 s2) {
                                return Double.compare(s1.rollNo, s2.rollNo);
                }

}
