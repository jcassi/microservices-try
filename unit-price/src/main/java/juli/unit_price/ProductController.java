package juli.unit_price;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("unit-price/products/{product}")
    public Double getPrize(@PathVariable String product) {
        return 2.0;
    }
}
