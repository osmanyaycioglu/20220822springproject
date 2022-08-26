package com.training.spring.rest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class MyCountBean {

    private int counter = 0;

    public int count() {
        return counter++;
    }

}
