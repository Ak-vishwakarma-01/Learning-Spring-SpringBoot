package com.example._howtouploadfile;

import org.springframework.context.annotation.Bean;

@org.springframework.boot.SpringBootConfiguration
// this configuration tell to the main class that this object has been created and manage it.
public class SpringBootConfiguration {
    @Bean // it will create object of it inside ioc container
    Student student(){
        return  new Student();
    }

    @Bean
    Employee employee(){
        return new Employee();
    }
}
