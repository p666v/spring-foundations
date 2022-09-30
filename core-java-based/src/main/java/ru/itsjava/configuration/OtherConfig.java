package ru.itsjava.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import ru.itsjava.Animal;
import ru.itsjava.KindFarmer;

public class OtherConfig {
    @Bean
    public KindFarmer farmer(@Qualifier("lamb") Animal animal) {
        return new KindFarmer(animal);
    }
}
