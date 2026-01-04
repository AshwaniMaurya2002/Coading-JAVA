class One{

 String name;
 int price;




public void setDetails(String n,int p){
name=n;
price=p;
}

public void printDetails(){
System.out.println("name is"+ name);
System.out.println("name is"+ price);

}


public static void main(String[] args){

One o1=new One();
o1.setDetails("mohan",42);
o1.printDetails();


}


}