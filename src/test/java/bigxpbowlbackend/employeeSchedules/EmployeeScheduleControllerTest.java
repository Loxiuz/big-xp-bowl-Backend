package bigxpbowlbackend.employeeSchedules;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class EmployeeScheduleControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeScheduleService employeeScheduleService;

    private EmployeeSchedule employeeSchedule;

    @BeforeEach
    void setUp() {
        employeeSchedule = new EmployeeSchedule();
        employeeSchedule.setId(1);
    }

    @Test
    void getAllEmployeeSchedules() throws Exception {
        when(employeeScheduleService.findAllEmployeeSchedules()).thenReturn(Collections.singletonList(employeeSchedule));

        mockMvc.perform(get("/employeeschedules"))
                .andExpect(status().isOk())
                .andExpect(content().json("[{'id': 1}]")); // Add other fields as necessary
    }
}