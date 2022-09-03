package tech.developerdhairya.DigiBatuaEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DigiBatuaEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DigiBatuaEurekaServerApplication.class, args);
    }

}
