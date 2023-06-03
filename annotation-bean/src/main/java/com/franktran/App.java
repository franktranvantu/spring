package com.franktran;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        App app = new App();
        HelloBean helloBean = app.getHelloBean("helloBean");
        helloBean.sayHello();
    }

    public HelloBean getHelloBean(String name) {
        var context = new AnnotationConfigApplicationContext("com.franktran");
        var helloBean = context.getBean(name, HelloBean.class);
        return helloBean;
    }
}
