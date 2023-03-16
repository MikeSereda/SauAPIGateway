package ru.sereda.sauapigateway;

//import io.swagger.v3.oas.models.annotations.OpenAPI31;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@OpenAPI31
@EnableDiscoveryClient
public class SauApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SauApiGatewayApplication.class, args);
    }

}
