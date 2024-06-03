package bigxpbowlbackend.employeeSchedules;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

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
