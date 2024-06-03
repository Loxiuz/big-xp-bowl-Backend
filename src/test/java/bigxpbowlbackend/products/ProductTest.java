package bigxpbowlbackend.products;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ProductTest {

    private Product product;

    @BeforeEach
    void setUp() {
        product = new Product();
    }

    @Test
    void settingAndGettingId() {
        product.setId(1);
        assertEquals(1, product.getId());
    }

    @Test
    void settingAndGettingName() {
        product.setName("Pizza");
        assertEquals("Pizza", product.getName());
    }

    @Test
    void settingAndGettingPrice() {
        product.setPrice(9.99);
        assertEquals(9.99, product.getPrice());
    }

    @Test
    void settingAndGettingSize() {
        product.setSize("medium");
        assertEquals("medium", product.getSize());
    }

    @Test
    void settingAndGettingInStock() {
        product.setInStock(true);
        assertTrue(product.getInStock());
    }
}