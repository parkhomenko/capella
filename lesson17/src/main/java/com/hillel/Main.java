package com.hillel;

import java.util.ArrayList;
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
    int result = animals.size();
    String element = animals.get(345);
  }
}
