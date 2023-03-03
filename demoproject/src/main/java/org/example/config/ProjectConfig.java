package org.example.config;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Vehicle vehicle() {
        var veh = new Vehicle();
        veh.setName("Rav4");
        return veh;
    }

    @Bean
    String hello() {
        return "hello";
    }

    @Bean
    int number() {
        return 10;
    }
}
