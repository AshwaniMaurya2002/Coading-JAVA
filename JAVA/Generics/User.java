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
        
        User<String> u1=new User<>("ashwani","maurya");
        System.out.println(u1);

    }
    

    

}
