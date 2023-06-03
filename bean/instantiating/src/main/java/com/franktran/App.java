package com.franktran;

import com.franktran.constructor.ExampleBean;
import com.franktran.staticmethod.ClientService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        App app = new App();
        ExampleBean constructorBean = app.getConstructorBean();
        ClientService staticMethodBean = app.getStaticMethodBean();
        com.franktran.instancemethod.ClientService instanceMethodBean = app.getInstanceMethodBean();
        System.out.println(constructorBean);
        System.out.println(staticMethodBean);
        System.out.println(instanceMethodBean);
    }

    public ExampleBean getConstructorBean() {
        var context = new ClassPathXmlApplicationContext("constructor.xml");
        return context.getBean("exampleBean", ExampleBean.class);
    }

    public ClientService getStaticMethodBean() {
        var context = new ClassPathXmlApplicationContext("static-factory-method.xml");
        return context.getBean("clientService", ClientService.class);
    }

    public com.franktran.instancemethod.ClientService getInstanceMethodBean() {
        var context = new ClassPathXmlApplicationContext("instance-factory-method.xml");
        return context.getBean("clientService", com.franktran.instancemethod.ClientService.class);
    }
}
