package bigxpbowlbackend.lanesAndAirTables;

import bigxpbowlbackend.reservations.Reservation;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class LaneAndAirTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;
    private Boolean isJunior;
    private Boolean isActive;
}
