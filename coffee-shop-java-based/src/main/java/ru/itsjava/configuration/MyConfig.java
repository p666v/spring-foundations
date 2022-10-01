package ru.itsjava.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.services.CoffeeHouse;
import ru.itsjava.services.CoffeeHouseImpl;
import ru.itsjava.services.CoffeeService;
import ru.itsjava.services.CoffeeServiceImpl;

@Configuration
public class MyConfig {

    @Bean
    public CoffeeService coffeeService() {
        return new CoffeeServiceImpl();
    }

    @Bean
    public CoffeeHouse coffeeHouse(CoffeeService coffeeService) {
        return new CoffeeHouseImpl(coffeeService);
    }


}
