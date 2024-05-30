package bigxpbowlbackend.equipment;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipment")
public class EquipmentController {

    private final EquipmentService equipmentService;

    public EquipmentController(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }

    @GetMapping
    public List<Equipment> getAllEquipment() {
        return equipmentService.findAllEquipment();
    }

    @PutMapping("/{id}")
    public Equipment getEquipmentById(@PathVariable String id, @RequestBody Equipment equipment) {
        return equipmentService.updateEquipmentById(id, equipment);
    }
}
