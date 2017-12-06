package com.hillel.shop;

public class ShopCart {

  private Product[] products = new Product[20];
  private int count;

  public ShopCart() {
  }

  public void addProduct(Product product) {
    products[count] = product;
    count++;
  }

  /*public void removeProduct(Product product) {

  }*/

  public void showAllProducts() {
    for (int i = 0; i < count; i++) {
      System.out.println(products[i]);
    }
  }
}
