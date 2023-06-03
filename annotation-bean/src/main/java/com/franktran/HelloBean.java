package com.franktran;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {
  private String message = "Hello, Spring!";;

  public void sayHello() {
    System.out.println(message);
  }
}
