public class Encapsulation {
    protected int age;
    private String name;

    public void setDetails(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public String getDetails() {
        return "the age is : " + age + "\n The name is : " + name;
    }
}
