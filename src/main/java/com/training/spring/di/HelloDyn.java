package com.training.spring.di;

import org.springframework.stereotype.Component;

public class HelloDyn implements IHello{

    private String helloPrefix;
    private String goodbyePrefix;

    public HelloDyn(String helloPrefix,
                    String goodbyePrefix) {
        this.helloPrefix = helloPrefix;
        this.goodbyePrefix = goodbyePrefix;
    }

    @Override
    public String sayHello(String name) {
        return helloPrefix + " " + name ;
    }

    @Override
    public String sayGoodBye(String name) {
        return goodbyePrefix + " " + name ;
    }

    public String anotherHello(String name) {
        return "Another Hello " + name;
    }
}
