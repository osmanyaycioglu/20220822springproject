package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
// Singleton Eager
public class MyApprunner implements ApplicationRunner {

    @Autowired
    private AppProp2 appProp2;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(appProp2);
    }

}
