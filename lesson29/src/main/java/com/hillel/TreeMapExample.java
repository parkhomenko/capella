package com.hillel;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

  public static void main(String[] args) {
    /*Map<Integer, String> students = new TreeMap<>();

    students.put(1, "John");
    students.put(3, "Kathy");
    students.put(2, "Alex");

    System.out.println(students);*/

    Map<Dog, String> dogs = new TreeMap<>();

    Dog dog1 = new Dog("Sharik", 5);
    Dog dog2 = new Dog("Bobik", 3);
    Dog dog3 = new Dog("Tuzik", 2);

    dogs.put(dog1, "first");
    dogs.put(dog2, "second");
    dogs.put(dog3, "third");

    System.out.println(dogs);

    //Map<Dog, String> dogs2 = new TreeMap<>(new DogAgesComparator());

    Map<Dog, String> dogs2 = new TreeMap<>(Comparator.comparingInt(Dog::getAge));
  }
}
