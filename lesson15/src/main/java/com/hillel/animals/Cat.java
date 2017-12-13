package com.hillel.animals;

public class Cat extends Animal {

  private String name;
  private String breed;

  public Cat(String name, String breed) {
    super(34, 23);
    this.name = name;
    this.breed = breed;
  }

  public void voice() {
    System.out.println("Meow");
  }

}
