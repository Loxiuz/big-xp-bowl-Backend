package bigxpbowlbackend.reservations;

import bigxpbowlbackend.customers.Customer;
import bigxpbowlbackend.customers.CustomerRepository;
import bigxpbowlbackend.dinningTables.DiningTable;
import bigxpbowlbackend.dinningTables.DiningTableRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;
    private final CustomerRepository customerRepository;
    private final DiningTableRepository diningTableRepository;

    public ReservationService(ReservationRepository reservationRepository, CustomerRepository customerRepository, DiningTableRepository diningTableRepository){
        this.reservationRepository = reservationRepository;
        this.customerRepository = customerRepository;
        this.diningTableRepository = diningTableRepository;
    }

    public List<ReservationDTO> findAllReservations(){
        return reservationRepository.findAll().stream().map(ReservationDTO::new).toList();
    }

    public ReservationDTO saveReservation(ReservationDTO reservation){
        Reservation newReservation = new Reservation();
        updateReservation(newReservation, reservation);
        reservationRepository.save(newReservation);
        return new ReservationDTO(newReservation);
    }

    public ReservationDTO updateReservation(int id, ReservationDTO reservation){
        Optional<Reservation> original = reservationRepository.findById(id);
        if(original.isPresent()){
            updateReservation(original.get(), reservation);
            reservationRepository.save(original.get());
            return new ReservationDTO(original.get());
        }
        return null;
    }

    public void updateReservation(Reservation original, ReservationDTO r){
        original.setNumberOfParticipants(r.getNumberOfParticipants());
        original.setActivity(r.getActivity());
        original.setNumberOfStandardLanes(r.getNumberOfStandardLanes());
        original.setNumberOfJrLanes(r.getNumberOfJrLanes());
        original.setNumberOfAirTables(r.getNumberOfAirTables());
        original.setActivityStart(r.getActivityStart());
        original.setActivityEnd(r.getActivityEnd());
        original.setIsValid(r.getIsValid());

        if(r.getCustomerId() != null){
            Optional<Customer> customer = customerRepository.findById(r.getCustomerId());
            customer.ifPresent(original::setCustomer);
        } else {
            original.setCustomer(null);
        }

        if(r.getDiningTableId() != null){
            Optional<DiningTable> diningTable = diningTableRepository.findById(r.getDiningTableId());
            diningTable.ifPresent(original::setDiningTable);
        } else {
            original.setDiningTable(null);
        }
    }
}
