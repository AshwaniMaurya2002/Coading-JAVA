

public class practice {

    String name;
    int price;
    double hp;

    practice(String n, int p, double h) {
        name = n;
        price = p;
        hp = h;
    }

    public void getDetails() {
        System.out.println(name);
        System.out.println(price);
        System.out.println(hp);
    }

}
