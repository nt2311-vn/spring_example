package com.nt2311.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
  @Bean
  public MyFirstClass myFirstClass() {
    return new MyFirstClass("First bean");
  }
}
