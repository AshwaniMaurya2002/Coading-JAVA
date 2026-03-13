public class ArithmeticExceptionProgram {


    public static void Operation(){
          try {
              System.out.println(12/0);
        } catch (Exception e) {
            System.out.println("Divided by zero is not possible");
        }
       
    }


    public static void main(String[] args) {
        
      Operation();

    }
    
}
