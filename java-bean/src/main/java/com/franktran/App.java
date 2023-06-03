package com.franktran;

import com.franktran.service.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        App app = new App();
        HelloService helloService = app.getGreetingService("greetingService");
        helloService.greet();
    }

    public HelloService getGreetingService(String name) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        var greetingService = context.getBean(name, HelloService.class);
        return greetingService;
    }
}
