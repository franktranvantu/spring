package com.franktran.singleton;

import com.franktran.service.DefaultAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private ApplicationContext context = new ClassPathXmlApplicationContext("singleton.xml");
    public static void main(String[] args) {
        App app = new App();
        DefaultAccountService accountService = app.getBean("accountService");
        DefaultAccountService anotherAccountService = app.getBean("accountService");
        System.out.println(accountService);
        System.out.println(anotherAccountService);
        System.out.println(accountService == anotherAccountService);
    }

    public DefaultAccountService getBean(String name) {
        return context.getBean(name, DefaultAccountService.class);
    }
}
