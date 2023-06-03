package com.franktran.ioc;

import org.springframework.stereotype.Component;

@Component
public class GreetingBean {
  private String message = "Spring!";

  public void sayGreeting() {
    System.out.println("Greeting, " + message);
  }
}
