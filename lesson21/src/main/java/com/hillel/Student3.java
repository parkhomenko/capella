package com.hillel;

public class Student3 {

  private String firstName;
  private String lastName;
  private int age;
  private String address;
  private String city;

  private Student3(Builder builder) {
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.age = builder.age;
    this.address = builder.address;
    this.city = builder.city;
  }

  public static class Builder {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String city;

    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Builder address(String address) {
      this.address = address;
      return this;
    }

    public Builder city(String city) {
      this.city = city;
      return this;
    }

    public Student3 build() {
      return new Student3(this);
    }
  }

}
