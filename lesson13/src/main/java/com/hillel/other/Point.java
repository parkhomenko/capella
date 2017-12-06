package com.hillel.other;

public class Point {

  private double x;
  private double y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public double distance(Point point) {
    return Math.pow(this.x - point.x, 2);
  }

  public void setX(double x) {
    this.x = x;
  }

  public void setY(double y) {
    this.y = y;
  }

}
