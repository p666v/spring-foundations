package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("ru.itsjava")
public class Main {
    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(Main.class);

        Animal piglet = context.getBean("piglet", Animal.class);
        piglet.say();

        KindFarmer farmer = context.getBean("farmer", KindFarmer.class);
        farmer.hiToAnimal();
    }
}
