package com.hillel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student implements Externalizable, Cloneable {

  private static final long serialVersionUID = -1;

  private String name;
  private int age;
  private String password;
  private City city;

  public Student(String name, int age, String password, City city) {
    this.name = name;
    this.age = age;
    this.password = password;
    this.city = city;
  }

  public Student(Student student) {
    this.name = new String(student.name);
    this.age = student.age;
    this.password = new String(student.password);
    this.city = new City(student.city);
  }

  @Override
  public void writeExternal(ObjectOutput out) throws IOException {
    out.writeObject(name);
    out.writeInt(age);
    String encoded = encodePassword(password);
    out.writeObject(encoded);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Student student = (Student) o;

    if (age != student.age) {
      return false;
    }
    if (!name.equals(student.name)) {
      return false;
    }
    if (!password.equals(student.password)) {
      return false;
    }
    return city.equals(student.city);
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + age;
    result = 31 * result + password.hashCode();
    result = 31 * result + city.hashCode();
    return result;
  }

  private String encodePassword(String password) {
    return null;
  }

  @Override
  public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    name = (String) in.readObject();
    age = in.readInt();
    String encoded = (String) in.readObject();
    password = decodePassword(encoded);
  }

  private String decodePassword(String encoded) {
    return null;
  }

  protected Student copyStudent() throws CloneNotSupportedException {
    Student student = (Student) super.clone();
    student.city = this.city.copyCity();
    return student;
  }
}
