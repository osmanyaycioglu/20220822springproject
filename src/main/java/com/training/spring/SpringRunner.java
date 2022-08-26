package com.training.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class SpringRunner {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringProjectApplication.class,
                                                                   args);
        SpringProjectApplication bean = context.getBean(SpringProjectApplication.class);
        bean.greeatAll();
    }

}
