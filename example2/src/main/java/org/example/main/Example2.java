package org.example.main;

import org.example.bean.Car;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Car myCar = context.getBean(Car.class);
        myCar.setName("Honda civic");
        System.out.println("component car name from context is " + myCar.getName());
    }
}
