package bigxpbowlbackend.products;

import bigxpbowlbackend.sales.Sale;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Double price;
    private String size; // "small", "medium" or "large".
    private Boolean inStock;
}
