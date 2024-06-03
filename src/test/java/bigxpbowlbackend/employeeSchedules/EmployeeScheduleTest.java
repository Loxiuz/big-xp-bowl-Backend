package bigxpbowlbackend.employeeSchedules;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeScheduleTest {

    private EmployeeSchedule employeeSchedule;

    @BeforeEach
    void setUp() {
        employeeSchedule = new EmployeeSchedule();
    }

    @Test
    void settingAndGettingId() {
        employeeSchedule.setId(1);
        assertEquals(1, employeeSchedule.getId());
    }

    @Test
    void settingAndGettingEmployeeRole() {
        employeeSchedule.setEmployeeRole("Waiter");
        assertEquals("Waiter", employeeSchedule.getEmployeeRole());
    }

    @Test
    void settingAndGettingShiftStart() {
        LocalTime shiftStart = LocalTime.of(9, 0);
        employeeSchedule.setShiftStart(shiftStart);
        assertEquals(shiftStart, employeeSchedule.getShiftStart());
    }

    @Test
    void settingAndGettingShiftEnd() {
        LocalTime shiftEnd = LocalTime.of(17, 0);
        employeeSchedule.setShiftEnd(shiftEnd);
        assertEquals(shiftEnd, employeeSchedule.getShiftEnd());
    }
}