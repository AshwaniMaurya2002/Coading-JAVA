
public class practice {
     int price;

    public  void setDetails(practice p,int n){
        p.price=n;
    }

    

    public static void main(String[] args) {
        practice obj = new practice();
        obj.price=300;
        obj.setDetails(obj, 1000);
        System.out.println(obj.price);
    }

}
