package bigxpbowlbackend.reservations;

import bigxpbowlbackend.customers.Customer;
import bigxpbowlbackend.customers.CustomerRepository;
import bigxpbowlbackend.dinningTables.DiningTable;
import bigxpbowlbackend.dinningTables.DiningTableRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.*;

class ReservationServiceTest {

    @InjectMocks
    private ReservationService reservationService;

    @Mock
    private ReservationRepository reservationRepository;

    @Mock
    private CustomerRepository customerRepository;

    @Mock
    private DiningTableRepository diningTableRepository;

    private Reservation reservation1, reservation2;
    private ReservationDTO reservationDTO;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        Customer customer1 = new Customer();
        customer1.setId(1);
        Customer customer2 = new Customer();
        customer2.setId(2);

        when(customerRepository.findById(1)).thenReturn(Optional.of(customer1));
        when(customerRepository.findById(2)).thenReturn(Optional.of(customer2));

        DiningTable diningTable1 = new DiningTable();
        diningTable1.setId(1);
        DiningTable diningTable2 = new DiningTable();
        diningTable2.setId(2);

        when(diningTableRepository.findById(1)).thenReturn(Optional.of(diningTable1));
        when(diningTableRepository.findById(2)).thenReturn(Optional.of(diningTable2));

        reservation1 = new Reservation();
        reservation1.setId(1);
        reservation1.setCustomer(customer1);
        reservation1.setDiningTable(diningTable1);

        reservation2 = new Reservation();
        reservation2.setId(2);
        reservation2.setCustomer(customer2);
        reservation2.setDiningTable(diningTable2);

        reservationDTO = new ReservationDTO(reservation1);
    }

    @Test
    void findAllReservationsReturnsAllReservations() {
        when(reservationRepository.findAll()).thenReturn(Arrays.asList(reservation1, reservation2));

        List<ReservationDTO> result = reservationService.findAllReservations();

        assertEquals(2, result.size());
        verify(reservationRepository, times(1)).findAll();
    }

    @Test
    void saveReservationReturnsSavedReservation() {
        when(reservationRepository.save(any(Reservation.class))).thenReturn(reservation1);

        ReservationDTO expected = new ReservationDTO(reservation1);
        ReservationDTO result = reservationService.saveReservation(reservationDTO);

        assertEquals(expected, result);
        verify(reservationRepository, times(1)).save(any(Reservation.class));
    }

    @Test
    void updateReservationReturnsUpdatedReservation() {
        when(reservationRepository.findById(1)).thenReturn(Optional.of(reservation1));
        when(reservationRepository.save(any(Reservation.class))).thenReturn(reservation1);

        ReservationDTO expected = new ReservationDTO(reservation1);
        ReservationDTO result = reservationService.updateReservation(1, reservationDTO);

        assertEquals(expected, result);
        verify(reservationRepository, times(1)).save(any(Reservation.class));
    }

    @Test
    void updateReservationReturnsNullWhenReservationNotFound() {
        when(reservationRepository.findById(1)).thenReturn(Optional.empty());

        ReservationDTO result = reservationService.updateReservation(1, reservationDTO);

        assertNull(result);
        verify(reservationRepository, times(0)).save(any(Reservation.class));
    }
}