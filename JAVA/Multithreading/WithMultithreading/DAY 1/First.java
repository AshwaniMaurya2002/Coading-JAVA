
public class First  extends Thread{

    String name;
    int count=0;

    public First() {
    }

    First(String name,int count){

        this.name=name;
        this.count=count;
    
    }

    @Override
    public void run(){

        count++;

    }

    public static void main(String[] args) {
        First f1=new First();
    }
    
}
