package bigxpbowlbackend.employeeSchedules;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class EmployeeScheduleServiceTest {

    @InjectMocks
    private EmployeeScheduleService employeeScheduleService;

    @Mock
    private EmployeeScheduleRepository employeeScheduleRepository;

    private EmployeeSchedule employeeSchedule1, employeeSchedule2;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        employeeSchedule1 = new EmployeeSchedule();
        employeeSchedule1.setId(1);
        employeeSchedule2 = new EmployeeSchedule();
        employeeSchedule2.setId(2);
    }

    @Test
    void findAllEmployeeSchedulesReturnsAllEmployeeSchedules() {
        when(employeeScheduleRepository.findAll()).thenReturn(Arrays.asList(employeeSchedule1, employeeSchedule2));

        List<EmployeeSchedule> result = employeeScheduleService.findAllEmployeeSchedules();

        assertEquals(2, result.size());
        verify(employeeScheduleRepository, times(1)).findAll();
    }
}