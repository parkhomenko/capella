package com.hillel.other;

public class Main {

  public static void main(String[] args) {
    Point first = new Point(3, 6);
    Point second = new Point(5, 10);

    double distance = first.distance(second);
    System.out.println(distance);
  }
}
