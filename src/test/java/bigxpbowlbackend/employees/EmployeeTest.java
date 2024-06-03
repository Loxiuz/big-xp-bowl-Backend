package bigxpbowlbackend.employees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmployeeTest {

    private Employee employee;

    @BeforeEach
    void setUp() {
        employee = new Employee();
    }

    @Test
    void settingAndGettingId() {
        employee.setId(1);
        assertEquals(1, employee.getId());
    }

    @Test
    void settingAndGettingFullName() {
        employee.setFullName("John Doe");
        assertEquals("John Doe", employee.getFullName());
    }

    @Test
    void settingAndGettingEmail() {
        employee.setEmail("john.doe@example.com");
        assertEquals("john.doe@example.com", employee.getEmail());
    }

    @Test
    void settingAndGettingPhoneNumber() {
        employee.setPhoneNumber("1234567890");
        assertEquals("1234567890", employee.getPhoneNumber());
    }

    @Test
    void settingAndGettingDateOfBirth() {
        LocalDate dateOfBirth = LocalDate.of(1990, 1, 1);
        employee.setDateOfBirth(dateOfBirth);
        assertEquals(dateOfBirth, employee.getDateOfBirth());
    }

    @Test
    void settingAndGettingIsActive() {
        employee.setIsActive(true);
        assertTrue(employee.getIsActive());
    }
}