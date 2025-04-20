package com.nt2311.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
  @GetMapping("/hello")
  public String sayHello() {
    return "Hello from my first controller";
  }

  @GetMapping("/hello-2")
  public String sayHello2() {
    return "Hello 2 from my first controller";
  }
}
