package juli.unit_prize;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("unit-prize/{product}")
    public Double getPrize(@PathVariable String product) {
        return 2.0;
    }
}
