package bigxpbowlbackend.sales;

import bigxpbowlbackend.products.Product;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SaleWithProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Sale sale;
    @ManyToOne
    private Product product;
    private int quantity;
}
