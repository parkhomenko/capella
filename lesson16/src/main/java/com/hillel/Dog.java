package com.hillel;

public class Dog {

  private Dog() {
  }

  public static Dog createDog() {
    return new Dog();
  }

  public void bark() {
    System.out.println("Bark, bark...");
  }

}
