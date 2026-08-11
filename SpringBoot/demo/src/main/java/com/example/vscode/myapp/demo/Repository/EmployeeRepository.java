
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vscode.myapp.demo.Entity.Employee;

public interface EmployeeRepository
        extends JpaRepository<Employee, Long> {
}
