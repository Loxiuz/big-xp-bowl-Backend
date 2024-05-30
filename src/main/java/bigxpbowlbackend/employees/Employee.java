package bigxpbowlbackend.employees;

import bigxpbowlbackend.employeeSchedules.EmployeeSchedule;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fullName;
    private String email;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private Boolean isActive;
    @ManyToMany
    @JoinTable(name = "employee_with_schedule")
    private Set<EmployeeSchedule> employeeSchedule;
}
