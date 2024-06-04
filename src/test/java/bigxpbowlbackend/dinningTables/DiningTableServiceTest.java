package bigxpbowlbackend.dinningTables;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class DiningTableServiceTest {

    @InjectMocks
    private DiningTableService diningTableService;

    @Mock
    private DiningTableRepository diningTableRepository;

    private DiningTable diningTable1, diningTable2;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        diningTable1 = new DiningTable();
        diningTable1.setId(1);
        diningTable2 = new DiningTable();
        diningTable2.setId(2);
    }

    @Test
    void findAllDiningTablesReturnsAllDiningTables() {
        when(diningTableRepository.findAll()).thenReturn(Arrays.asList(diningTable1, diningTable2));

        List<DiningTable> result = diningTableService.findAllDiningTables();

        assertEquals(2, result.size());
        verify(diningTableRepository, times(1)).findAll();
    }
}