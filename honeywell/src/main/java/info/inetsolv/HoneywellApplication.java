package info.inetsolv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HoneywellApplication {

	public static void main(String[] args) {
		SpringApplication.run(HoneywellApplication.class, args);
	}
}
