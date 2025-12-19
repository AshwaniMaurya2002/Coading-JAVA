
public class FacebookUserDriver {

    public static void main(String[] args) {
        FacebookUser user1 = new FacebookUser();
        user1.name = "Jhethalal";
        user1.age = 25;
        user1.email = "abc@gmail.com";
        user1.password = "jhethalal123";

        FacebookUser user2 = new FacebookUser();
        user2.name = "Babita";
        user2.age = 30;
        user2.email = "xyz@gmail.com";
        user2.password = "babita123";

        System.out.println("---------Object1 User1--------------");
        System.out.println("Name: " + user1.name);
        System.out.println("Age: " + user1.age);
        System.out.println("Email: " + user1.email);
        System.out.println("Password: " + user1.password);
        System.out.println("\n---------Object2 User2--------------");
        System.out.println("\nName: " + user2.name);
        System.out.println("Age: " + user2.age);
        System.out.println("Email: " + user2.email);
        System.out.println("Password: " + user2.password);
    }
}
