class Order{
	String name;
	int price;
	double id;

	Order(String n,int p,double d){
	name=n;
	price=p;
	id=d;
	}

public void getDetails(){
	System.out.println("NAME IS: "+name);
	System.out.println("Price is:" +price);
	System.out.println("ID id : " + id);
}

}

