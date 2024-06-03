package bigxpbowlbackend.dinningTables;
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
class DiningTableControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DiningTableService diningTableService;

    private DiningTable diningTable;

    @BeforeEach
    void setUp() {
        diningTable = new DiningTable();
        diningTable.setId(1);
    }

    @Test
    void getAllDiningTables() throws Exception {
        when(diningTableService.findAllDiningTables()).thenReturn(Collections.singletonList(diningTable));

        mockMvc.perform(get("/diningtables"))
                .andExpect(status().isOk())
                .andExpect(content().json("[{'id': 1}]")); // Add other fields as necessary
    }
}