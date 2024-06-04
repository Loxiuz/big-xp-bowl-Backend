package bigxpbowlbackend.sales;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class SaleServiceTest {

    @InjectMocks
    private SaleService saleService;

    @Mock
    private SaleRepository saleRepository;

    private Sale sale1, sale2;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        sale1 = new Sale();
        sale1.setId(1);
        sale2 = new Sale();
        sale2.setId(2);
    }

    @Test
    void findAllSalesReturnsAllSales() {
        when(saleRepository.findAll()).thenReturn(Arrays.asList(sale1, sale2));

        List<Sale> result = saleService.findAllSales();

        assertEquals(2, result.size());
        verify(saleRepository, times(1)).findAll();
    }
}