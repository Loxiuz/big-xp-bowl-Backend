package bigxpbowlbackend.customers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {

    private Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer();
    }

    @Test
    void settingAndGettingId() {
        customer.setId(1);
        assertEquals(1, customer.getId());
    }

    @Test
    void settingAndGettingFullName() {
        customer.setFullName("John Doe");
        assertEquals("John Doe", customer.getFullName());
    }

    @Test
    void settingAndGettingEmail() {
        customer.setEmail("john.doe@example.com");
        assertEquals("john.doe@example.com", customer.getEmail());
    }

    @Test
    void settingAndGettingBirthDate() {
        LocalDate birthDate = LocalDate.of(1990, 1, 1);
        customer.setBirthDate(birthDate);
        assertEquals(birthDate, customer.getBirthDate());
    }

    @Test
    void settingAndGettingPhoneNumber() {
        customer.setPhoneNumber("1234567890");
        assertEquals("1234567890", customer.getPhoneNumber());
    }
}