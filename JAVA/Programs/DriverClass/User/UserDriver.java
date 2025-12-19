class UserDriver{
public static void main(String[] args){

User u1=new User();
User u2=new User();


u1.name="Ritik Mishra";
u1.id=101;
u1.job="automation testing";

u2.name="Gaurav verma";
u2.id=103;
u2.job="Develeop";

System.out.println("-----USER1 Details----\n");
System.out.println("name is :"+ u1.name);
System.out.println("ID is :"+ u1.id);
System.out.println("JOb is :"+u1.job);

System.out.println("-----USER2 Details----\n");
System.out.println("name is :"+ u2.name);
System.out.println("ID is :"+ u2.id);
System.out.println("JOb is :"+u2.job);

}
}