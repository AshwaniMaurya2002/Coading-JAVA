
public class FacebookUserDriver {
    public static void main(String[] args) {
        FacebookUser user = new FacebookUser("john_doe", "john@example.com", 20);

        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Age: " + user.getAge());

        user.setEmail("john_new@example.com");
        System.out.println("Updated Email: " + user.getEmail());

        user.setAge(15);
        System.out.println("Updated Age: " + user.getAge());

        user.setAge(10);
    }
}