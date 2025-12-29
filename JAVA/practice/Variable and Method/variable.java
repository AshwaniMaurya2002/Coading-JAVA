class variable{
     int a=40;
      void test(){
        // int a=60;
         // local variable
        System.out.println("Local variable a: " + a);
    }


    public static void main(String[] args) {
        variable v=new variable();
       v.test();
    }
}