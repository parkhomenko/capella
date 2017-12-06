package com.hillel;

public class Flashlight {

  private static final int BATTERIES_LIMIT = 4;
  private int batteries;

  public void addBattery() {
    if (batteries == BATTERIES_LIMIT) {
      return;
    }

    batteries++;
  }

  public void shines() {
    if (batteries == BATTERIES_LIMIT) {
      System.out.println("Светит");
    } else {
      System.out.println("Не светит");
    }
  }

}
