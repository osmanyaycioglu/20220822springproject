package com.training.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Service
//@Repository
//@Controller
//@Configuration

@Component
@Lazy
public class MyBean {

    public String finisher(String str){
        return str + " thanks all";
    }

}
