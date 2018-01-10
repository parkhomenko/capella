package com.hillel;

import java.util.Objects;

public class Dog extends Animal implements Comparable<Dog> {

  private String name;
  private int age;

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj.getClass() != Dog.class) {
      return false;
    }

    Dog that = (Dog) obj;

    boolean names = Objects.equals(this.name, that.name);
    boolean ages = this.age == that.age;

    return names && ages;
  }

  @Override
  public int compareTo(Dog dog) {
    /*if (this.age < dog.age) {
      return -1;
    }

    if (this.age > dog.age) {
      return 1;
    }

    return 0;*/

    //return this.age - dog.age;

    return Integer.compare(this.age, dog.age);
  }

  @Override
  public String toString() {
    return "Dog{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}
