package com.hillel;

import java.util.HashSet;
import java.util.Set;

public class StandardSet {

  public static void main(String[] args) {

    Set<String> names = new HashSet<>();
    names.add("John");
    names.add("Kate");
    names.add("John");

    System.out.println(names);
  }

}
