package com.hillel;

public class SomeClass {

  public static int getResult(int var) {
    if (var == 5) {
      throw new RuntimeException("Just a test");
    }

    return var - 5;
  }

}
