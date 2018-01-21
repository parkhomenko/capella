package com.hillel;

public class StackOverflowExample {

  public static void main(String[] args) {
    someMethod();
  }

  private static void someMethod() {
    someMethod();
  }

}
