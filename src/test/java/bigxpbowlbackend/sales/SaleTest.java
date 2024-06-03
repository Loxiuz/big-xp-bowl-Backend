package bigxpbowlbackend.sales;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class SaleTest {

    private Sale sale;

    @BeforeEach
    void setUp() {
        sale = new Sale();
    }

    @Test
    void settingAndGettingId() {
        sale.setId(1);
        assertEquals(1, sale.getId());
    }

    @Test
    void settingAndGettingSaleDate() {
        LocalDateTime saleDate = LocalDateTime.of(2022, 1, 1, 10, 0);
        sale.setSaleDate(saleDate);
        assertEquals(saleDate, sale.getSaleDate());
    }

    @Test
    void saleDateIsAutomaticallySet() {
        Sale newSale = new Sale();
        assertNotNull(newSale.getSaleDate());
    }
}