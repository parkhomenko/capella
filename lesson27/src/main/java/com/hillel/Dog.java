package com.hillel;

import java.io.Serializable;

public class Dog implements Serializable {

  private static final long serialVersionUID = -1;

  private String name1;
  private int age;
  private Owner owner;
  private int test = 5;

  public Dog(String name, int age, Owner owner) {
    this.name1 = name;
    this.age = age;
    this.owner = owner;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Dog dog = (Dog) o;

    if (age != dog.age) {
      return false;
    }
    if (name1 != null ? !name1.equals(dog.name1) : dog.name1 != null) {
      return false;
    }
    return owner != null ? owner.equals(dog.owner) : dog.owner == null;
  }

  @Override
  public int hashCode() {
    int result = name1 != null ? name1.hashCode() : 0;
    result = 31 * result + age;
    result = 31 * result + (owner != null ? owner.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Dog{" +
        "name='" + name1 + '\'' +
        ", age=" + age +
        '}';
  }
}
