package com.hillel.shop;

public class Product {

  private String name;
  private double price;
  private Color color;

  public Product(String name, double price, Color color) {
    this.name = name;
    this.price = price;
    this.color = color;
  }

  @Override
  public String toString() {
    return this.name + " " + this.price + " " + this.color;
  }
}
