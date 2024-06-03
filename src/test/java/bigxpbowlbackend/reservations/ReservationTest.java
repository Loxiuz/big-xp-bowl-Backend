package bigxpbowlbackend.reservations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ReservationTest {

    private Reservation reservation;

    @BeforeEach
    void setUp() {
        reservation = new Reservation();
    }

    @Test
    void settingAndGettingId() {
        reservation.setId(1);
        assertEquals(1, reservation.getId());
    }

    @Test
    void settingAndGettingNumberOfParticipants() {
        reservation.setNumberOfParticipants(5);
        assertEquals(5, reservation.getNumberOfParticipants());
    }

    @Test
    void settingAndGettingActivity() {
        reservation.setActivity("Bowling");
        assertEquals("Bowling", reservation.getActivity());
    }

    @Test
    void settingAndGettingNumberOfStandardLanes() {
        reservation.setNumberOfStandardLanes(2);
        assertEquals(2, reservation.getNumberOfStandardLanes());
    }

    @Test
    void settingAndGettingNumberOfJrLanes() {
        reservation.setNumberOfJrLanes(1);
        assertEquals(1, reservation.getNumberOfJrLanes());
    }

    @Test
    void settingAndGettingNumberOfAirTables() {
        reservation.setNumberOfAirTables(3);
        assertEquals(3, reservation.getNumberOfAirTables());
    }

    @Test
    void settingAndGettingActivityStart() {
        LocalDateTime activityStart = LocalDateTime.of(2022, 1, 1, 10, 0);
        reservation.setActivityStart(activityStart);
        assertEquals(activityStart, reservation.getActivityStart());
    }

    @Test
    void settingAndGettingActivityEnd() {
        LocalDateTime activityEnd = LocalDateTime.of(2022, 1, 1, 12, 0);
        reservation.setActivityEnd(activityEnd);
        assertEquals(activityEnd, reservation.getActivityEnd());
    }

    @Test
    void settingAndGettingIsValid() {
        reservation.setIsValid(true);
        assertTrue(reservation.getIsValid());
    }
}