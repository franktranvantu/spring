package com.franktran;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
  @Bean
  public GreetingService greetingService() {
    var helloBean = new HelloBean();
    helloBean.setMessage("Hello, Spring!");
    var greetingService = new GreetingService();
    greetingService.setHelloBean(helloBean);
    return greetingService;
  }
}
