package com.franktran.domain;

public class HelloBean {
  private String message;

  public HelloBean(String message) {
    this.message = message;
  }

  public void sayHello() {
    System.out.println("Hello, " + message);
  }
}
