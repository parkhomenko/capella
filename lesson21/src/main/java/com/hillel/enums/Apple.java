package com.hillel.enums;

public enum Apple {
  GREEN(1, "Green color"),
  RED(2, "Red color"),
  BLUE(3, "Blue color"),
  YELLOW(4, "Yellow color");

  private int index;
  private String color;

  Apple(int index, String color) {
    this.index = index;
    this.color = color;
  }

  public int getIndex() {
    return index;
  }

  public String getColor() {
    return color;
  }
}
