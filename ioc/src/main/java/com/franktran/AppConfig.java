package com.franktran;

import com.franktran.domain.HelloBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
  @Bean
  public HelloService helloService() {
    HelloBean helloBean = new HelloBean("Spring!");
    return new HelloService(helloBean);
  }
}
