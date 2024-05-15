package bigxpbowlbackend.reservations;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository){
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> findAllReservations(){
        return reservationRepository.findAll();
    }

    public Reservation saveReservation(Reservation reservation){
        return reservationRepository.save(reservation);
    }
}
