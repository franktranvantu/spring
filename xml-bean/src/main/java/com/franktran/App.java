package com.franktran;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        App app = new App();
        GreetingService greetingService = app.getGreetingService("greetingService");
        greetingService.greet();
    }

    public GreetingService getGreetingService(String name) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
        var greetingService = context.getBean(name, GreetingService.class);
        return greetingService;
    }
}
