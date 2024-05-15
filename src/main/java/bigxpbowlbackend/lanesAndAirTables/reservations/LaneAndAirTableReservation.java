package bigxpbowlbackend.lanesAndAirTables.reservations;

import bigxpbowlbackend.lanesAndAirTables.LaneAndAirTable;
import bigxpbowlbackend.reservations.Reservation;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class LaneAndAirTableReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Reservation reservation;
    @ManyToOne
    private LaneAndAirTable laneAndAirTable;
}
