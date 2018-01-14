package com.hillel.enums;

public class FruitMain {

  public static void main(String[] args) {

    /*if (fruit == Fruit.APPLE_YELLOW) {
      System.out.println();
    }*/

    //Apple green = Apple.GREEN;

    /*for (Apple apple : Apple.values()) {
      System.out.println(apple.ordinal() + " " + apple.name());
    }*/

    Apple[] apples = Apple.values();
    for (Apple apple : apples) {
      System.out.println(apple.getIndex() + " " + apple.getColor());
    }

    EnumSingleton instance = EnumSingleton.INSTANCE;
    instance.hello();
  }
}
