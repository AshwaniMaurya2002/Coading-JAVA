
 class Fruit {

     static  int price;

    public static  void printPrice(Fruit a,int val){
        a.price=val;
    }
    public static  void printDetails(){
        System.out.println("The value of Price :" + price);
    }



    public static void main(String[] args) {
        Fruit f=new Fruit();
        printPrice(f,400);
        printDetails();
    }
    
}
