
class Fruit {
    int price;
    double weight;
    

    public void setValues( int p, double w) {
        price = p;
        weight = w;

    }

    public void getValues() {

        System.out.println("The Price is : " + price + "\n The weight is : " + weight);

    }

    public static void main(String[] args) {
        Fruit f = new Fruit();
        f.setValues( 12, 543);
        f.price=32;
        f.getValues();

    }

}
