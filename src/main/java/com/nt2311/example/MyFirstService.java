package com.nt2311.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

  private MyFirstClass myFirstClass;

  public MyFirstService(@Qualifier("bean2") MyFirstClass myFirstClass) {
    this.myFirstClass = myFirstClass;
  }

  public String tellAStory() {
    return "the dependency is saying : " + myFirstClass.sayHello();
  }
}
