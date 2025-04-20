package com.nt2311.example;

import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleApplication {

  public static void main(String[] args) {
    var app = new SpringApplication(ExampleApplication.class);
    app.setDefaultProperties(Collections.singletonMap("spring.profiles.active", "test"));
    var ctx = app.run(args);

    MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
    System.out.println(myFirstService.tellAStory());
    System.out.println(myFirstService.getCustomProperty());
    System.out.println(myFirstService.getCustomPropertyInt());
    System.out.println(myFirstService.getCustomPropertyFromAnotherFile());
    System.out.println(myFirstService.getCustomPropertyFromAnotherFile2());
  }
}
