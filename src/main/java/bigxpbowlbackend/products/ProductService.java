package bigxpbowlbackend.products;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;


@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public Product findProductById(int id){
        return productRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Product with id " + id + " not found"));
    }

    public Product updateProduct(int id, Product product){
        Product existingProduct = findProductById(id);
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setSize(product.getSize());
        existingProduct.setInStock(product.getInStock());
        return productRepository.save(existingProduct);
    }
}
