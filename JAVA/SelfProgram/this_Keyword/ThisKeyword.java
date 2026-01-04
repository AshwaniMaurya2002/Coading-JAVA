
public class ThisKeyword {

    int x=20;

    public void  getValue(){
        int x=10;
        System.out.println(x);
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        ThisKeyword t=new ThisKeyword();
        t.getValue();

    }
    
}
