package com.hillel;

public class MainCloneable {

  public static void main(String[] args) throws CloneNotSupportedException {

    City city = new City("Odessa");
    Student student = new Student("John", 35, "asdfasdf", city);

    //Student student2 = student.copyStudent();
    Student student2 = new Student(student);

    System.out.println(student2);
  }

}
