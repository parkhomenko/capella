package com.hillel;

public class Student2 {

  private String firstName;
  private String lastName;
  private int age;
  private String address;
  private String city;

  public Student2(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public Student2(String firstName, String lastName, int age, String address) {
    this(firstName, lastName, age);
    this.address = address;
  }

  public Student2(String firstName, String lastName, int age, String address, String city) {
    this(firstName, lastName, age, address);
    this.city = city;
  }

}
