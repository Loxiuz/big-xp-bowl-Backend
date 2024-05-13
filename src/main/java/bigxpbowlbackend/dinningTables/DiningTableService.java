package bigxpbowlbackend.dinningTables;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiningTableService {

    private final DiningTableRepository diningTableRepository;

    public DiningTableService(DiningTableRepository diningTableRepository) {
        this.diningTableRepository = diningTableRepository;
    }

    public List<DiningTable> findAllDiningTables() {
        return diningTableRepository.findAll();
    }
}
