package com.hillel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    /*List<String> animals = new ArrayList<>();
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Monkey");

    for (String animal : animals) {
      System.out.println(animal);
    }*/

    CustomList animals = new CustomArrayList();
    //int result = animals.size();
    //String element = animals.get(345);
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Monkey");

    /*Iterator iterator = animals.iterator();
    while (iterator.hasNext()) {
      String animal = (String) iterator.next();
      System.out.println(animal);
    }*/

    /*
    for (Object animal : animals) {
      System.out.println(animal);
    }
    */

    Iterator backIterator = animals.backwardIterator();
    while (backIterator.hasNext()) {
      String animal = (String) backIterator.next();
      System.out.println(animal);
    }
  }
}
