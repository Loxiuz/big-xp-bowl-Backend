package bigxpbowlbackend.reservations;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    private final ReservationService reservationService;

    public  ReservationController(ReservationService reservationService){
        this.reservationService = reservationService;
    }

    @GetMapping
    public List<Reservation> getAllReservations(){
        return reservationService.findAllReservations();
    }
}
