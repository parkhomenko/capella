package com.hillel;

public class Main {

  public static void main(String[] args) {

    Student john = new Student("John", "Wayne", 34);
    Student mark = new Student("Mark", "Twain", 25);
    Student jessy = new Student("Jessy", "Smith", 28);

    Student john2 = new Student("John", "Wayne", 34);

    Grade poor = new Grade("Poor", 2, "F");
    Grade good = new Grade("Good", 4, "B");
    Grade excellent = new Grade("Excellent", 5, "A");

    CustomHashMap map = new CustomHashMap();
    map.put(john, poor);
    map.put(mark, good);
    map.put(jessy, excellent);
    map.put(john2, excellent);
  }

}
