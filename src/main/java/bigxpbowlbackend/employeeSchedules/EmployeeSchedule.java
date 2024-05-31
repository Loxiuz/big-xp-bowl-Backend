package bigxpbowlbackend.employeeSchedules;

import bigxpbowlbackend.employees.Employee;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Getter
@Setter
@Entity
public class EmployeeSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String employeeRole;
    private LocalTime shiftStart;
    private LocalTime shiftEnd;
}
