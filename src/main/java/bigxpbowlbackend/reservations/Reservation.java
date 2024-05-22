package bigxpbowlbackend.reservations;

import bigxpbowlbackend.customers.Customer;
import bigxpbowlbackend.dinningTables.DiningTable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;
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
    private String activity; // Bowling, Air Hockey
    private int numberOfStandardLanes;
    private int numberOfJrLanes;
    private int numberOfAirTables;
    private LocalDateTime activityStart;
    private LocalDateTime activityEnd;
    @CreationTimestamp
    private LocalDateTime creationDateTime;
    private Boolean isValid;
}
