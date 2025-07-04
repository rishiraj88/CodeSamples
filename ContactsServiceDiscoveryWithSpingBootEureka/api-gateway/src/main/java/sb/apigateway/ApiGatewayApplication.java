package sb.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class ApiGatewayApplication {
    public static void main(String[] args) {
        // new SpringApplicationBuilder(ApiGatewayApplication.class).web(WebApplicationType.REACTIVE).run(args);
        SpringApplication.run(ApiGatewayApplication.class, args);
    }
}
