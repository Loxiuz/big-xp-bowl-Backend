package bigxpbowlbackend.sales;

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
class SaleControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SaleService saleService;

    private Sale sale;

    @BeforeEach
    void setUp() {
        sale = new Sale();
        sale.setId(1);
    }

    @Test
    void getAllSales() throws Exception {
        when(saleService.findAllSales()).thenReturn(Collections.singletonList(sale));

        mockMvc.perform(get("/sales"))
                .andExpect(status().isOk())
                .andExpect(content().json("[{'id': 1}]")); // Add other fields as necessary
    }
}