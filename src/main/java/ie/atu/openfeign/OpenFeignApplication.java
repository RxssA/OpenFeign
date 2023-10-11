package ie.atu.openfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;]#

@EnableFeignClients
@SpringBootApplication
public class OpenFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignApplication.class, args);
    }

}
