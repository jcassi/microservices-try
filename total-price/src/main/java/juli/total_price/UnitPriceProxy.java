package juli.total_price;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="unit-price", url="localhost:8000")
public interface UnitPriceProxy {
    @GetMapping("unit-price/products/{product}")
    public Double getPrice(@PathVariable("product") String product);
}
