package it.learning.spring.backendservicesbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("it.learning.spring.backendservicesbank.controller")
public class BackendServicesBankApplication {
    public static void main(String[] args) {
        SpringApplication.run(BackendServicesBankApplication.class, args);
    }

}
