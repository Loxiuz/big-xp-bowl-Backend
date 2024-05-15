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
    private LocalDateTime activityStart;
    private LocalDateTime activityEnd;
    @CreationTimestamp
    private LocalDateTime creationDateTime;
    private Boolean isValid;
}
