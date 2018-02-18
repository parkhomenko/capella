package com.hillel;

public class CustomTreeMapExample {

  public static void main(String[] args) {

    CustomTreeMap students = new CustomTreeMap();

    students.add(1, "John");
    students.add(-5, "Kathy");
    students.add(3, "Alex");
    students.add(-9, "James");
    students.add(-3, "Dexter");
    students.add(0, "Hanna");

    students.traverse();

  }

}
