import java.util.ArrayList;
import java.util.List;

public class Employee {    
    int id;
    String name;

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
    @Override
    public String toString() {
    return  "Id is --->"+id+"  Name is--->"+name+"\n";
    }
    
    public static void main(String[] args) {

        List<Employee> emp=new ArrayList();
        emp.add(new Employee(1,"ashwani"));
        emp.add(new Employee(2,"Rohit"));
        emp.add(new Employee(3,"Rohit"));
        emp.add(new Employee(4,"Rohit"));   
        emp.add(new Employee(5,"Rohit"));

   
        emp.remove(3);
        System.out.println(emp);

        
    }
}
