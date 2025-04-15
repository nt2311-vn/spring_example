package com.nt2311.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {
  @Bean
  public MyFirstClass myFirstBean() {
    return new MyFirstClass("First bean");
  }

  @Bean
  public MyFirstClass mySecondBean() {
    return new MyFirstClass("Second bean");
  }

  @Bean
  @Primary
  public MyFirstClass myThirdBean() {
    return new MyFirstClass("Third bean");
  }
}
