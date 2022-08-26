package com.training.spring.di;

import com.training.spring.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Component("selamlama")
public class Greetings {
    // Field Injection
    @Autowired
    private CustomerManager customerManager;

    private IHello hello;
    private MyBean myBean;

    // Constructor Injection
    @Autowired
    public Greetings(@Qualifier("tr_hello") IHello hello) {
        this.hello = hello;
    }

    public Greetings(IHello hello,
                     int a) {
        this.hello = hello;
    }

    // Method Injection
    @Autowired
    public void xyz(MyBean myBean) {
        this.myBean = myBean;
    }

    @PostConstruct
    public void initX() {
        customerManager.init(this.getClass()
                                 .getName());
    }

    @PreDestroy
    public void destroyX(){

    }

    public String greet(String name) {
        List<String> tenCustomer = customerManager.getTenCustomer();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Greetings ").append(name);
        for (String s : tenCustomer) {
            stringBuilder.append(" ")
                         .append(hello.sayHello(s));
        }
        return myBean.finisher(stringBuilder.toString());
    }

}
