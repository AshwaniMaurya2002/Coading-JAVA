public class Driver {


    public static void main(String[] args) {
    // Vehichle v=new Vehicle("string",2134);  //not called because constructor is private

    //! we make a static method 

   Vehichle v= Vehichle.getInstance();
   v.drive();
   v.test();

    }

    
}
