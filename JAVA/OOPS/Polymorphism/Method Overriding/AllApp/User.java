public class User {

    public static void main(String[] args) {
        

        AllApp ap=new AllApp();

        EcommApp ecApp=ap.selectApp();
        ecApp.placeOrder(); 

    }
    
}
