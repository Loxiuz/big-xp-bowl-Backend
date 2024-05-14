package bigxpbowlbackend.reservations;


import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/create")
    public Reservation createReservation(@RequestBody Reservation reservation){
        return reservationService.saveReservation(reservation);
    }
}
