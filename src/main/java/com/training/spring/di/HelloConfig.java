package com.training.spring.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class HelloConfig {

    @Bean
    @Qualifier("meng1")
    public IHello helloCreate() {
        return new HelloEng();
    }

    @Bean("helloTest")
    @Qualifier("meng2")
    public IHello helloCreate2() {
        return new HelloEng();
    }

    @Bean("tr_hello")
    public IHello dynHello() {
        return new HelloDyn("selam",
                            "güle güle");
    }

    @Bean("eng_hello")
    @Scope("prototype")
    public IHello dynHello2() {
        return new HelloDyn("hi",
                            "bye");
    }

}
