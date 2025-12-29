class variable{
     int a=40;
      void test(){
        // int a=60;
         // local variable
         starticMethod();
        System.out.println("Local variable a: " + a);
    }

    static void starticMethod(){
        System.out.println("Static method called");
    }

    static void display(){
        // static method
        variable v=new variable();
        System.out.println("Static method called");
        v.test();
        starticMethod();
    }

    public static void main(String[] args) {
        display();
    }
}