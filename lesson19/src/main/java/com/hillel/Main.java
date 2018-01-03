package com.hillel;

import java.util.Iterator;

public class Main {

  public static void main(String[] args) {

    CustomLinkedList list = new CustomLinkedList();
    list.add(3);
    list.add(5);
    list.add(7);
    list.add(-9);

    /*Iterator iterator = list.iterator();
    while (iterator.hasNext()) {
      int element = (int) iterator.next();
      System.out.println(element);
    }*/

    for (Object element : list) {
      System.out.println(element);
    }
  }

}
