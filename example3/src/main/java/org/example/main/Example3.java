package org.example.main;

import org.example.beans.Car;
import org.example.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;
import java.util.function.Consumer;
public class Example3 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Car vw = new Car();
        vw.setName("vw");
        Supplier<Car> vwSupplier =() -> vw;

        Supplier<Car> audiSupplier = () -> {
            Car audi = new Car();
            audi.setName("audi");
            return audi;
        };

        Consumer<String> print = x -> System.out.print(x);

        Random randomNum = new Random();
        int randomInt = randomNum.nextInt(10);
        System.out.println("the generated number is " + randomInt);

        if (randomInt % 2 == 0) {
            context.registerBean("vw Car Bean", Car.class, vwSupplier);
        } else {
            context.registerBean("audi Car Bean", Car.class, audiSupplier);
        }

        Car newVWBean = null;
        Car newAudiBean = null;

    }

}
