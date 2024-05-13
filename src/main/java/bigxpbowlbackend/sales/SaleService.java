package bigxpbowlbackend.sales;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    private final SaleRepository saleRepository;

    public SaleService(SaleRepository saleRepository){
        this.saleRepository = saleRepository;
    }

    public List<Sale> findAllSales(){
        return saleRepository.findAll();
    }
}
