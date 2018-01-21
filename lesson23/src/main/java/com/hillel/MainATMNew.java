package com.hillel;

public class MainATMNew {

  public static void main(String[] args) {
    ATMNew atmNew = new ATMNew();

    if (atmNew.hasEnoughMoney(500)) {
      atmNew.getMoney(500);
    } else {
      System.out.println("asdfsdaf");
    }
  }

}
