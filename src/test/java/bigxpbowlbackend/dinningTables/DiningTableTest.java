package bigxpbowlbackend.dinningTables;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiningTableTest {

    private DiningTable diningTable;

    @BeforeEach
    void setUp() {
        diningTable = new DiningTable();
    }

    @Test
    void settingAndGettingId() {
        diningTable.setId(1);
        assertEquals(1, diningTable.getId());
    }

    @Test
    void settingAndGettingNumberOfSeats() {
        diningTable.setNumberOfSeats(4);
        assertEquals(4, diningTable.getNumberOfSeats());
    }
}