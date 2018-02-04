package com.hillel;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Main {

  public static void main(String[] args) {

    Student student = new Student("John", "Smith", 25, new Date());

    String name = student.getFirstname();
    String substring = name.substring(0, 1);

    System.out.println(student.getFirstname());

    Date someDate = student.getBirthday();
    someDate.setYear(2015);

    System.out.println(student.getBirthday());

    LocalDate localDate = LocalDate.now();
    LocalTime localTime = LocalTime.of(12, 35);

    Instant instant = Instant.now();
  }

}
