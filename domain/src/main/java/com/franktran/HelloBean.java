package com.franktran;

public class HelloBean {
  private String message;

  public void setMessage(String message) {
    this.message = message;
  }

  public void sayHello() {
    System.out.println(message);
  }
}
