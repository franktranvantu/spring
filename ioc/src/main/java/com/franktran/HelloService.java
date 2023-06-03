package com.franktran;

import com.franktran.domain.HelloBean;

public class HelloService {
  private HelloBean helloBean;

  public HelloService(HelloBean helloBean) {
    this.helloBean = helloBean;
  }

  public void greet() {
    helloBean.sayHello();
  }
}
