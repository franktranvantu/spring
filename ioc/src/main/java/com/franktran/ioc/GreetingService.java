package com.franktran.ioc;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {
  private GreetingBean greetingBean;

  public GreetingService(GreetingBean greetingBean) {
    this.greetingBean = greetingBean;
  }

  public void greeting() {
    greetingBean.sayGreeting();
  }
}
