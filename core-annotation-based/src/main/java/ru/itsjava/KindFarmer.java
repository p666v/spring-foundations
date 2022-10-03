package ru.itsjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("farmer")
public class KindFarmer {
    private final Animal animal;

    @Autowired
    public KindFarmer(@Qualifier("lamb") Animal animal) {
        this.animal = animal;
    }

    public void hiToAnimal() {
        System.out.println("Привет моя любимая");
        animal.say();
    }
}
