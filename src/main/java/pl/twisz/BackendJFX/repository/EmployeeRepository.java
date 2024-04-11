package pl.twisz.BackendJFX.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.twisz.BackendJFX.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
