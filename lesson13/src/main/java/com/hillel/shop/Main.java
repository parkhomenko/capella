package com.hillel.shop;

public class Main {

  public static void main(String[] args) {
    Product tv = new Product("Телевизор", 34, Color.BLACK);
    Product coffeeMachine = new Product("Кофемашина", 23, Color.WHITE);

    ShopCart cart = new ShopCart();
    cart.addProduct(tv);
    cart.addProduct(coffeeMachine);

    cart.showAllProducts();

    //cart.removeProduct(coffeeMachine);
  }
}
