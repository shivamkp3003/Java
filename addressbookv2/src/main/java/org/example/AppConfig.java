package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="org.example")
public class AppConfig {

    @Bean
    @Scope("prototype")
    public User user(){
        return new User("Vishwas","vishwas@cloudthat.com","1234567890");
    }
}
