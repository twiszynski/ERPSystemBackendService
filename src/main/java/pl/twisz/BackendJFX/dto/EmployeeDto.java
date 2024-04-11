package pl.twisz.BackendJFX.dto;

import lombok.Data;
import pl.twisz.BackendJFX.entity.Employee;

@Data
public class EmployeeDto {

    private Long idEmployee;
    private String firstName;
    private String lastName;
    private String salary;

    public static EmployeeDto of(Employee employee){
       EmployeeDto employeeDto = new EmployeeDto();
       employeeDto.setIdEmployee(employee.getIdEmployee());
       employeeDto.setFirstName(employee.getFirstName());
       employeeDto.setLastName(employee.getLastName());
       employeeDto.setSalary(employee.getSalary());
       return employeeDto;
    }
}
