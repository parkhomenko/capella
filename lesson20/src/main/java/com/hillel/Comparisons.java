package com.hillel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparisons {

  public static void main(String[] args) {

    List<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(3);
    numbers.add(4);
    System.out.println(numbers);

    Collections.sort(numbers);
    System.out.println(numbers);

    Dog sharik = new Dog("Sharik", 5);
    Dog bobik = new Dog("Bobik", 3);
    Dog sharikJR = new Dog("SharikJR", 5);

    List<Dog> dogs = new ArrayList<>();
    dogs.add(sharik);
    dogs.add(bobik);
    dogs.add(sharikJR);

    Collections.sort(dogs);
    System.out.println(dogs);

    /*Comparator decreaseDogsComparator = new DecreaseDogsComparator();
    Collections.sort(dogs, decreaseDogsComparator);*/

    /*Collections.sort(dogs, new Comparator<Dog>() {
      @Override
      public int compare(Dog o1, Dog o2) {
        return Integer.compare(o2.getAge(), o1.getAge());
      }
    });*/

    Collections.sort(dogs, (o1, o2) -> Integer.compare(o2.getAge(), o1.getAge()));
  }

}
