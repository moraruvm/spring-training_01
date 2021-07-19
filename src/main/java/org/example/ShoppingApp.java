package org.example;

import org.example.repo.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ShoppingApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(ShoppingApp.class, args);

        // we can also start getting spring beans here
        ctx.getBean(ProductRepository.class);
        // but our application has other "inputs" now, like handling http requests
    }

}
