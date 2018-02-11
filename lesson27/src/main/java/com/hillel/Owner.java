package com.hillel;

import java.io.Serializable;

public class Owner implements Serializable {

  private static final long serialVersionUID = -1;

  private String name;
  private int age;

  public Owner(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Owner owner = (Owner) o;

    if (age != owner.age) {
      return false;
    }
    return name.equals(owner.name);
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + age;
    return result;
  }
}
