package bigxpbowlbackend.equipment;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {

    private final EquipmentRepository equipmentRepository;

    public EquipmentService(EquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    public List<Equipment> findAllEquipment() {
        return equipmentRepository.findAll();
    }

    public Equipment updateEquipmentById(String id, Equipment equipment) {
        Equipment equipmentToUpdate = equipmentRepository.findById(Integer.valueOf(id)).orElseThrow();
        equipmentToUpdate.setName(equipment.getName());
        equipmentToUpdate.setQuantity(equipment.getQuantity());
        equipmentToUpdate.setStatus(equipment.getStatus());
        return equipmentRepository.save(equipmentToUpdate);
    }
}
