public class Driver is {
    public static void main(String[] args) {
        
        name n=new name(6_000_000_000L);
        name n1=new name(6_000_000_000L);
        name n2=new name(6_000_000_000L);
        name n3=new name(6_000_000_000L);
        name n4=new name(6_000_000_000L);
        name n5=new name(6_000_000_000L);


        n.start();
        n2.start();
        n1.start();
        n3.start();
        n4.start();
        n5.start();
        
        n.join();
        n1.join();  
        n2.join();
        n3.join();
        n4.join();
        n5.join();

    }
}
