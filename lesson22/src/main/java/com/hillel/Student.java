package com.hillel;

public class Student {

  private String firstName;
  private String lastName;
  private int age;

  public Student(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
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

    Student student = (Student) o;

    return age == student.age && firstName.equals(student.firstName) && lastName
        .equals(student.lastName);

  }

  @Override
  public int hashCode() {
    int result = firstName.hashCode();
    result = 31 * result + lastName.hashCode();
    result = 31 * result + age;
    return result;
  }
}
