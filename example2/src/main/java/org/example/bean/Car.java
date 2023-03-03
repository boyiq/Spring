package org.example.bean;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;


@Component
public class Car {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void namCar() {
        this.setName("New");
    }
}
