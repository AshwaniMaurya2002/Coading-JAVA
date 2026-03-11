public class Employ {

    String name;
    int price;

    public Employ() {
    }

    // public Employ(String name, int price) {
    //     this.name = name;
    //     this.price = price;
    // }
    @Override
    public String toString() {
        return "The Name is : "+name +"  "+"The price is :"+ price;
    }

  

    public  Employ setName(String name){
        this.name=name;
        return this;
    }

        public  Employ setPrice(int price){
        this.price=price;
        return this;
    }
    
}
