package bigxpbowlbackend.lanesAndAirTables;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lanes_and_air_tables")
public class LaneAndAirTableController {

    public final LaneAndAirTableService laneAndAirTableService;

    public LaneAndAirTableController(LaneAndAirTableService laneAndAirTableService) {
        this.laneAndAirTableService = laneAndAirTableService;
    }

    @GetMapping
    public List<LaneAndAirTable> getLaneAndAirTables() {
        return laneAndAirTableService.findAllLaneAndAirTables();
    }
}
