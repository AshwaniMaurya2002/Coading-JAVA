public class EmployDriver {
    
    public static void main(String[] args) {
        
        Employ employ = new Employ().new Builder().setAddress("noida").setAge(54).build();

        System.out.println("Employ Name: " + employ.name);
        System.out.println("Employ ID: " + employ.id);
        System.out.println("Employ Age: " + employ.age);
        System.out.println("Employ Address: " + employ.address);

    }
}
