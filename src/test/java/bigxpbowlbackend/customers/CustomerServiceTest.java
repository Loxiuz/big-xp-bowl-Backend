package bigxpbowlbackend.customers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class CustomerServiceTest {

    @InjectMocks
    private CustomerService customerService;

    @Mock
    private CustomerRepository customerRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void findAllCustomersReturnsAllCustomers() {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        when(customerRepository.findAll()).thenReturn(Arrays.asList(customer1, customer2));

        List<Customer> result = customerService.findAllCustomers();

        assertEquals(2, result.size());
        verify(customerRepository, times(1)).findAll();
    }

    @Test
    void saveCustomerReturnsSavedCustomer() {
        Customer customer = new Customer();
        when(customerRepository.save(any(Customer.class))).thenReturn(customer);

        Customer result = customerService.saveCustomer(new Customer());

        assertEquals(customer, result);
        verify(customerRepository, times(1)).save(any(Customer.class));
    }
}