package com.franktran;

import com.franktran.ioc.GreetingService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        App app = new App();
//        HelloService helloService = app.getHelloService();
//        helloService.greet();

        GreetingService greetingService = app.getGreetingService();
        greetingService.greeting();;
    }

    public HelloService getHelloService() {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloService helloService = context.getBean("helloService", HelloService.class);
        return helloService;
    }

    public GreetingService getGreetingService() {
        var context = new AnnotationConfigApplicationContext("com.franktran.ioc");
        GreetingService greetingService = context.getBean("greetingService", GreetingService.class);
        return greetingService;
    }
}
