package com.nt2311.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

  @Autowired
  @Qualifier("mySecondBean")
  private MyFirstClass myFirstClass;

  public String tellAStory() {
    return "the dependency is saying : " + myFirstClass.sayHello();
  }
}
