package com.franktran;

import com.franktran.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        App app = new App();
        HelloService helloService = app.getGreetingService("helloÏService");
        helloService.greet();
    }

    public HelloService getGreetingService(String name) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
        var greetingService = context.getBean(name, HelloService.class);
        return greetingService;
    }
}
