package com.hillel;

import java.util.Date;

public class Student {

  private String firstname;
  private String lastname;
  private int age;
  private Date birthday;

  public Student(String firstname, String lastname, int age, Date birthday) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.age = age;
    this.birthday = birthday;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Date getBirthday() {
    return new Date(birthday.getTime());
  }

  public void setBirthday(Date birthday) {
    this.birthday = new Date(birthday.getTime());
  }
}
