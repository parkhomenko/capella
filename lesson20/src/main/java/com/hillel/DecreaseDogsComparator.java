package com.hillel;

import java.util.Comparator;

public class DecreaseDogsComparator implements Comparator<Dog> {

  @Override
  public int compare(Dog o1, Dog o2) {
    return Integer.compare(o2.getAge(), o1.getAge());
  }

}
