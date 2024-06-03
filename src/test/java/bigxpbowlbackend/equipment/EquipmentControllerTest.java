package bigxpbowlbackend.equipment;

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
class EquipmentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EquipmentService equipmentService;

    private Equipment equipment;

    @BeforeEach
    void setUp() {
        equipment = new Equipment();
        equipment.setId(1);
        // Set other fields as necessary
    }

    @Test
    void getAllEquipment() throws Exception {
        when(equipmentService.findAllEquipment()).thenReturn(Collections.singletonList(equipment));

        mockMvc.perform(get("/equipment"))
                .andExpect(status().isOk())
                .andExpect(content().json("[{'id': 1}]")); // Add other fields as necessary
    }
}