package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import ru.itsjava.services.CoffeeHouse;

@ComponentScan("ru.itsjava.services")
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        CoffeeHouse coffeeHouse = context.getBean("coffeeHouse", CoffeeHouse.class);
        coffeeHouse.buyCoffeeFromShop();
    }

}
