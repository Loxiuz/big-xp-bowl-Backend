package bigxpbowlbackend.employees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class EmployeeServiceTest {

    @InjectMocks
    private EmployeeService employeeService;

    @Mock
    private EmployeeRepository employeeRepository;

    private Employee employee1, employee2;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        employee1 = new Employee();
        employee1.setId(1);
        employee2 = new Employee();
        employee2.setId(2);
    }

    @Test
    void findAllEmployeesReturnsAllEmployees() {
        when(employeeRepository.findAll()).thenReturn(Arrays.asList(employee1, employee2));

        List<Employee> result = employeeService.findAllEmployees();

        assertEquals(2, result.size());
        verify(employeeRepository, times(1)).findAll();
    }
}