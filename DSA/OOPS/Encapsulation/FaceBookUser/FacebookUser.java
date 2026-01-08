
public class FacebookUser {
    private String name;
    private String email;
    private int age;

    public FacebookUser(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void setEmail(String email) {
        if (email.matches("[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}")) {
            this.email = email;
        } else {
            System.out.println("Invalid email address.");
        }
    }

    public void setAge(int age) {
        if (age > 13 ) {
            this.age = age;
        } else {
            System.out.println("Age must be Above 13.");
        }
    }
    
}
