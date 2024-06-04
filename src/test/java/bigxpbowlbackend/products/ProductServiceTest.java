package bigxpbowlbackend.products;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

class ProductServiceTest {

    @InjectMocks
    private ProductService productService;

    @Mock
    private ProductRepository productRepository;

    private Product product1, product2;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        product1 = new Product();
        product1.setId(1);
        product2 = new Product();
        product2.setId(2);
    }

    @Test
    void findAllProductsReturnsAllProducts() {
        when(productRepository.findAll()).thenReturn(Arrays.asList(product1, product2));

        List<Product> result = productService.findAllProducts();

        assertEquals(2, result.size());
        verify(productRepository, times(1)).findAll();
    }

    @Test
    void saveProductReturnsSavedProduct() {
        when(productRepository.save(any(Product.class))).thenReturn(product1);

        Product result = productService.saveProduct(product1);

        assertEquals(product1, result);
        verify(productRepository, times(1)).save(product1);
    }

    @Test
    void findProductByIdReturnsProduct() {
        when(productRepository.findById(1)).thenReturn(Optional.of(product1));

        Product result = productService.findProductById(1);

        assertEquals(product1, result);
        verify(productRepository, times(1)).findById(1);
    }

    @Test
    void findProductByIdThrowsExceptionWhenProductNotFound() {
        when(productRepository.findById(1)).thenReturn(Optional.empty());

        assertThrows(NoSuchElementException.class, () -> productService.findProductById(1));
        verify(productRepository, times(1)).findById(1);
    }

    @Test
    void updateProductUpdatesAndReturnsProduct() {
        when(productRepository.findById(1)).thenReturn(Optional.of(product1));
        when(productRepository.save(any(Product.class))).thenReturn(product1);

        Product result = productService.updateProduct(1, product1);

        assertEquals(product1, result);
        verify(productRepository, times(1)).save(product1);
    }
}