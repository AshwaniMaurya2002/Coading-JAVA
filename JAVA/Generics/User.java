public class User<T> {
    T roll;
    T id;

    public User() {
    }

    public User(T roll, T id) {
        this.roll = roll;
        this.id = id;
    }

    @Override
    public String toString(){
        return roll+" "+id;
    }

    public static void main(String[] args) {
        
        User<Integer> u1=new User<>(123, 1234);
        System.out.println(u1);

    }
    

    

}
