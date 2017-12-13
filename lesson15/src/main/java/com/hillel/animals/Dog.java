package com.hillel.animals;

public class Dog extends Animal {

  private String name;
  private String breed;

  public void walk() {
    System.out.println("I'm walking");
  }

  public void voice() {
    System.out.println("Bark bark");
  }

}
