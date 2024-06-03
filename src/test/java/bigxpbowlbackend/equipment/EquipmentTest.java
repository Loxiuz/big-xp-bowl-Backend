package bigxpbowlbackend.equipment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EquipmentTest {

    private Equipment equipment;

    @BeforeEach
    void setUp() {
        equipment = new Equipment();
    }

    @Test
    void settingAndGettingId() {
        equipment.setId(1);
        assertEquals(1, equipment.getId());
    }

    @Test
    void settingAndGettingName() {
        equipment.setName("Forklift");
        assertEquals("Forklift", equipment.getName());
    }

    @Test
    void settingAndGettingQuantity() {
        equipment.setQuantity(5);
        assertEquals(5, equipment.getQuantity());
    }

    @Test
    void settingAndGettingStatus() {
        equipment.setStatus("Available");
        assertEquals("Available", equipment.getStatus());
    }
}