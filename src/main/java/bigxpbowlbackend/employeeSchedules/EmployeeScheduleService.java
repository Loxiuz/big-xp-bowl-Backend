package bigxpbowlbackend.employeeSchedules;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeScheduleService {

    private final EmployeeScheduleRepository employeeScheduleRepository;

    public EmployeeScheduleService(EmployeeScheduleRepository employeeScheduleRepository) {
        this.employeeScheduleRepository = employeeScheduleRepository;
    }

    public List<EmployeeSchedule> findAllEmployeeSchedules() {
        return employeeScheduleRepository.findAll();
    }
}
