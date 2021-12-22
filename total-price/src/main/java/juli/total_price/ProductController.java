package juli.total_price;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("total-prize/{product}/quantity/{quantity}")
    public Double getPrize(@PathVariable String product, @PathVariable int quantity) {
        return quantity * 2.0;
    }
}
