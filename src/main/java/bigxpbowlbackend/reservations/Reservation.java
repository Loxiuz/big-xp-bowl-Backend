package bigxpbowlbackend.reservations;

import bigxpbowlbackend.customers.Customer;
import bigxpbowlbackend.dinningTables.DiningTable;
import bigxpbowlbackend.lanesAndAirTables.LaneAndAirTable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private DiningTable diningTable;
    private int numberOfParticipants;
    private LocalDateTime activityStart;
    private LocalDateTime activityEnd;
    @CreationTimestamp
    private LocalDateTime creationDateTime;
    private Boolean isValid;
    @ManyToMany
    @JoinTable(name = "lane_and_air_table_reservation")
    private Set<LaneAndAirTable> laneAndAirTable;
}
