package org.example;

import org.example.price.PriceCalculator;
import org.example.price.VATPriceCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

    @Bean
    @Primary
    public PriceCalculator getVatPriceCalculator() {
        return new VATPriceCalculator(1);
    }

}
