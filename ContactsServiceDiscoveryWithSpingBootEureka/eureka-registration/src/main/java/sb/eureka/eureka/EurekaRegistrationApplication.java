package sb.eureka.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaRegistrationApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaRegistrationApplication.class, args);
	}
}