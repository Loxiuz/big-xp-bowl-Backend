package bigxpbowlbackend.equipment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class EquipmentServiceTest {

    @InjectMocks
    private EquipmentService equipmentService;

    @Mock
    private EquipmentRepository equipmentRepository;

    private Equipment equipment1, equipment2;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        equipment1 = new Equipment();
        equipment1.setId(1);
        equipment2 = new Equipment();
        equipment2.setId(2);
    }

    @Test
    void findAllEquipmentReturnsAllEquipment() {
        when(equipmentRepository.findAll()).thenReturn(Arrays.asList(equipment1, equipment2));

        List<Equipment> result = equipmentService.findAllEquipment();

        assertEquals(2, result.size());
        verify(equipmentRepository, times(1)).findAll();
    }

    @Test
    void updateEquipmentByIdUpdatesAndReturnsEquipment() {
        when(equipmentRepository.findById(1)).thenReturn(Optional.of(equipment1));
        when(equipmentRepository.save(any(Equipment.class))).thenReturn(equipment1);

        Equipment result = equipmentService.updateEquipmentById("1", equipment1);

        assertEquals(equipment1, result);
        verify(equipmentRepository, times(1)).save(equipment1);
    }
}