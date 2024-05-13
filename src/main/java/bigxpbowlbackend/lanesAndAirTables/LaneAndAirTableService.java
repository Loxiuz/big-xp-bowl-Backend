package bigxpbowlbackend.lanesAndAirTables;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaneAndAirTableService {

    public final LaneAndAirTableRepository laneAndAirTableRepository;

    public LaneAndAirTableService(LaneAndAirTableRepository laneAndAirTableRepository) {
        this.laneAndAirTableRepository = laneAndAirTableRepository;
    }

    public List<LaneAndAirTable> findAllLaneAndAirTables() {
        return laneAndAirTableRepository.findAll();
    }
}
