package ac.rs.singidunum.springboot.repository;

import ac.rs.singidunum.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {


}
