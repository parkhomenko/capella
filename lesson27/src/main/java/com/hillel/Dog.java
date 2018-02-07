package com.hillel;

import java.io.Serializable;

public class Dog implements Serializable {

  private String name;
  private int age;

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Dog{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
