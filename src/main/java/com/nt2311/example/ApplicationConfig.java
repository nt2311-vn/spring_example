package com.nt2311.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
  @Bean
  @Qualifier("bean1")
  public MyFirstClass myFirstBean() {
    return new MyFirstClass("First bean");
  }

  @Bean
  @Qualifier("bean2")
  public MyFirstClass mySecondBean() {
    return new MyFirstClass("Second bean");
  }
}
