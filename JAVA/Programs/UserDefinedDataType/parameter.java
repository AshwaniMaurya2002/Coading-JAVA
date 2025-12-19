public class parameter {
    public static void main(String[] args) {

         class  Fruit{
            final String name;
            final int price;

            Fruit(String name,int price){

                this.name=name;
                this.price=price;
            }
            public void print1(){
                System.out.println(this.name);
                System.out.println(this.price);
            }
        }


        Fruit frt=new Fruit("ashwani",200);
        frt.print1();
    }
}
