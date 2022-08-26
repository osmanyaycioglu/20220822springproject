package com.training.spring;

import com.training.spring.di.Greetings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProjectApplication {

    @Autowired
    private Greetings greetings;

    public void greeatAll() {
        System.out.println(greetings.greet("osman"));
    }
}
