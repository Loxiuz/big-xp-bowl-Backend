package bigxpbowlbackend.reservations;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReservationDTO {
    private int id;
    private Integer customerId;
    private Integer diningTableId;
    private int numberOfParticipants;
    private String activity; // Bowling, Air Hockey
    private int numberOfStandardLanes;
    private int numberOfJrLanes;
    private int numberOfAirTables;
    private LocalDateTime activityStart;
    private LocalDateTime activityEnd;
    private LocalDateTime creationDateTime;
    private Boolean isValid;


    public ReservationDTO(Reservation r){
        this.id = r.getId();
        this.customerId = r.getCustomer().getId();
        this.diningTableId = r.getDiningTable().getId();
        this.numberOfParticipants = r.getNumberOfParticipants();
        this.activity = r.getActivity();
        this.numberOfStandardLanes = r.getNumberOfStandardLanes();
        this.numberOfJrLanes = r.getNumberOfJrLanes();
        this.numberOfAirTables = r.getNumberOfAirTables();
        this.activityStart = r.getActivityStart();
        this.activityEnd = r.getActivityEnd();
        this.creationDateTime = r.getCreationDateTime();
        this.isValid = r.getIsValid();
    }
}
