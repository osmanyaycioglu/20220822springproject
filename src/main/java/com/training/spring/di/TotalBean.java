package com.training.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TotalBean {

    @Autowired
    @Qualifier("eng_hello")
    private IHello hello1;
    @Autowired
    @Qualifier("eng_hello")
    private IHello hello2;
    @Autowired
    @Qualifier("eng_hello")
    private IHello hello3;
    @Autowired
    @Qualifier("eng_hello")
    private IHello hello4;

}
