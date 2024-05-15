package bigxpbowlbackend.lanesAndAirTables;

import bigxpbowlbackend.lanesAndAirTables.reservations.LaneAndAirTableReservation;
import bigxpbowlbackend.lanesAndAirTables.reservations.LaneAndAirTableReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaneAndAirTableService {

    private final LaneAndAirTableRepository laneAndAirTableRepository;
    private final LaneAndAirTableReservationRepository laneAndAirTableReservationRepository;

    public LaneAndAirTableService(LaneAndAirTableRepository laneAndAirTableRepository, LaneAndAirTableReservationRepository laneAndAirTableReservationRepository) {
        this.laneAndAirTableRepository = laneAndAirTableRepository;
        this.laneAndAirTableReservationRepository = laneAndAirTableReservationRepository;
    }

    public List<LaneAndAirTable> findAllLaneAndAirTables() {
        return laneAndAirTableRepository.findAll();
    }

    public List<LaneAndAirTableReservation> findRelatedReservations() {
        return laneAndAirTableReservationRepository.findAll();
    }
}
