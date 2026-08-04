import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Comparator1> list = new ArrayList<>();

        list.add(new Comparator1(3, "Rahul", 101));
        list.add(new Comparator1(1, "Amit", 102));
        list.add(new Comparator1(2, "Neha", 103));

        Collections.sort(list, new Comparator1());

        System.out.println(list);
    }
}