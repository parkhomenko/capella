package com.hillel;

public class Main {

  public static void main(String[] args) {
    int i = 5;

    Integer i1 = 6;
    Integer i2 = new Integer(6);
    Integer i3 = Integer.valueOf(6);

    /*Dog dog = new Dog();
    dog.bark();*/

    Dog dog1 = Dog.createDog();
    dog1.bark();

  }
}
