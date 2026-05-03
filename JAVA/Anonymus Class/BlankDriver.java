

abstract class Blank {
    public abstract void start();
}

public class BlankDriver {

    public static void main(String[] args) {
        
        Blank b=new Blank(){
            @Override
             public void start(){
System.out.println("hello i am starting");
            }
        };
          
    }
    
}
