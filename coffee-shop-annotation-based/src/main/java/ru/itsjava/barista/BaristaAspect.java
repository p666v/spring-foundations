package ru.itsjava.barista;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BaristaAspect {

    @Pointcut("execution(* ru.itsjava.services.CoffeeHouseImpl.buyCoffeeFromShop())")
    public void executeOperation() {
    }

    @After("executeOperation()")
    public void afterAdvice() {
        System.out.print("Вас обслуживал бариста Сергей!!!");
    }

}
