package com.nt2311.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleApplication {

  public static void main(String[] args) {
    var ctx = SpringApplication.run(ExampleApplication.class, args);

    MyFirstClass myFirstClass = ctx.getBean("myFirstClass", MyFirstClass.class);
    System.out.println(myFirstClass.sayHello());
  }
}
