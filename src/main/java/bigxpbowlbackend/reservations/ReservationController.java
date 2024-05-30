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
    public List<ReservationDTO> getAllReservations(){
        return reservationService.findAllReservations();
    }

    @PostMapping("/create")
    public ReservationDTO createReservation(@RequestBody ReservationDTO reservation){
        return reservationService.saveReservation(reservation);
    }

    @PutMapping("/{id}")
    public ReservationDTO updateReservation(@PathVariable int id, @RequestBody ReservationDTO reservation){
        return reservationService.updateReservation(id, reservation);
    }
}
