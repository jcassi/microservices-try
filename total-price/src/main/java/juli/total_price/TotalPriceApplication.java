package juli.total_price;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TotalPriceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TotalPriceApplication.class, args);
	}

}
