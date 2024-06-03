package bigxpbowlbackend.reservations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class ReservationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ReservationService reservationService;

    private ReservationDTO reservationDTO;

    @BeforeEach
    void setUp() {
        reservationDTO = new ReservationDTO();
        reservationDTO.setId(1);
        reservationDTO.setNumberOfParticipants(4);
    }

    @Test
    void getAllReservations() throws Exception {
        when(reservationService.findAllReservations()).thenReturn(Collections.singletonList(reservationDTO));

        mockMvc.perform(get("/reservations"))
                .andExpect(status().isOk())
                .andExpect(content().json("[{'id': 1, 'numberOfParticipants': 4}]"));
    }
}