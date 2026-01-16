
public class Car extends vehicle{
    int r=30;
    int x=32;


    public void printDetails(){
        int x=324;
        System.out.println(this.x);
        System.out.println(r);
        System.out.println(super.x);
        System.out.println(((Transport)this).x);
    }
}
