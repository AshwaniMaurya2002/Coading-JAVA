
class EmployDriver {

    public static void main(String[] args) {
        Employ e1 = new Employ();
        Employ e2 = new Employ();

        System.out.println("Employee 1 Before Initialization");
        System.out.println("Object address : " + e1);
        System.out.println("Employee name : " + e1.name);
        System.out.println("Employee ID : " + e1.id);

        System.out.println("Employee 2 Before Initialization");
        System.out.println("Object address : " + e2);
        System.out.println("Employee name : " + e2.name);
        System.out.println("Employee ID : " + e2.id);

        e1.name = "John Doe";
        e1.id = 101;
        e1.number = 1234567890L;

        e2.name = "Jane Smith";
        e2.id = 102;
        e2.number = 9876543210L;

        // System.out.println("Employee 1 After Initialization");
        // System.out.println("Object address : " + e1);
        // System.out.println("Employee name : " + e1.name);
        // System.out.println("Employee ID : " + e1.id);
        // System.out.println("Employee 2 After Initialization");
        // System.out.println("Object address : " + e2);
        // System.out.println("Employee name : " + e2.name);
        // System.out.println("Employee ID  : " + e2.id);
        System.out.println("Employee 1 Details:");
        e1.printDetails();
        e2.printDetails();
    }
}
