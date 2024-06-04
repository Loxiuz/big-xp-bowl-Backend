package bigxpbowlbackend.reservations;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReservationDTO that = (ReservationDTO) o;
        return id == that.id &&
                numberOfParticipants == that.numberOfParticipants &&
                numberOfStandardLanes == that.numberOfStandardLanes &&
                numberOfJrLanes == that.numberOfJrLanes &&
                numberOfAirTables == that.numberOfAirTables &&
                Objects.equals(customerId, that.customerId) &&
                Objects.equals(diningTableId, that.diningTableId) &&
                Objects.equals(activity, that.activity) &&
                Objects.equals(activityStart, that.activityStart) &&
                Objects.equals(activityEnd, that.activityEnd) &&
                Objects.equals(creationDateTime, that.creationDateTime) &&
                Objects.equals(isValid, that.isValid);
    }
}


