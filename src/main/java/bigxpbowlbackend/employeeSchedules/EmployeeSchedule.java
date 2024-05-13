package bigxpbowlbackend.employeeSchedules;

import bigxpbowlbackend.employees.Employee;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class EmployeeSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String employeeRole;
    @ManyToMany
    @JoinTable(name = "employee_with_schedule")
    private Set<Employee> employee;
}
