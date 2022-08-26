package com.training.spring.di;

public interface IHello {

    public static final int HELLO_DEFAULT = 1;

    String str = "osman";

    String sayHello(String name);

    String sayGoodBye(String name);

    default void sayHelloOut(String name) {
        System.out.println(sayHello(name));
    }

    public static String covert(String str) {
        return str.toUpperCase();
    }

}
