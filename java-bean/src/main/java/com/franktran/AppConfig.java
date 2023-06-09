package com.franktran;

import com.franktran.domain.HelloBean;
import com.franktran.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
  @Bean
  public HelloService greetingService() {
    var helloBean = new HelloBean("Spring!");
    var greetingService = new HelloService(helloBean);
    return greetingService;
  }
}
