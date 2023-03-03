package org.example.main;

import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Example1 {
    public static void main(String[] args) {
        Vehicle myCar = new Vehicle();
        myCar.setName("Civic");
        System.out.println("my car's name is " + myCar.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle car = context.getBean(Vehicle.class);
        System.out.println("My car's name from context is " + car.getName());

        String hi = context.getBean(String.class);
        System.out.println("string value from Spring context is " + hi);
        int num = context.getBean(int.class);
        System.out.println("integer value from Spring context is " + num);



    }

}
