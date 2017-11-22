package com.hillel;

public class Example {

  public static void main(String[] args) {

    if (func1() && func2() && func3()) {
      System.out.println("Just a test");
    }
  }

  public static boolean func1() {
    return false;
  }

  public static boolean func2() {
    return true;
  }

  public static boolean func3() {
    return false;
  }
}
