package com.hillel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StandardMap {

  public static void main(String[] args) {
    Student john = new Student("John", "Wayne", 34);
    Student mark = new Student("Mark", "Twain", 25);
    Student jessy = new Student("Jessy", "Smith", 28);

    Student john2 = new Student("John", "Wayne", 34);

    Grade poor = new Grade("Poor", 2, "F");
    Grade good = new Grade("Good", 4, "B");
    Grade excellent = new Grade("Excellent", 5, "A");

    Map<Student, Grade> map = new HashMap<>();
    map.put(john, poor);
    map.put(mark, good);
    map.put(jessy, excellent);
    map.put(john2, excellent);

    System.out.println(map);

    Map<Student, List<Grade>> map2 = new HashMap<>();

    List<Grade> grades = new ArrayList<>();
    grades.add(poor);
    grades.add(excellent);

    map2.put(john, grades);
  }
}
