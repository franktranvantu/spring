package com.franktran;

public class GreetingService {
  private HelloBean helloBean;

  public void setHelloBean(HelloBean helloBean) {
    this.helloBean = helloBean;
  }

  public void greet() {
    helloBean.sayHello();
  }
}
