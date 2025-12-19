class OrderDriver{

public static void main(String[] args){

Order o1=new Order();
Order o2=new Order();


o1.name="Mobile";
o1.id=101;
o1.price=23999;

o2.name="Headphone";
o2.id=103;
o2.price=5999;

System.out.println("Order Name :" + o1.name);
System.out.println("Order Price :" + o1.price);
System.out.println("Order ID :" + o1.id);

System.out.println("Order Name :" + o2.name);
System.out.println("Order Price :" + o2.price);
System.out.println("Order ID :" + o2.id);

}
}
