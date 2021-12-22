package juli.total_price;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private UnitPriceProxy proxy;

    @GetMapping("total-price/products/{product}/quantity/{quantity}")
    public Double getPrize(@PathVariable String product, @PathVariable int quantity) {
        Double unitPrice = proxy.getPrice(product);
        return quantity * unitPrice;
    }
}
