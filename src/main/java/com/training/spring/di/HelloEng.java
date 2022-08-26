package com.training.spring.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary
@Qualifier("ceng1")
public class HelloEng implements IHello {

    @Override
    public String sayHello(String name) {
        return "Hi " + name ;
    }

    @Override
    public String sayGoodBye(String name) {
        return "bye bye " + name ;
    }

    public String anotherHello(String name) {
        return "Another Hello " + name;
    }
}
