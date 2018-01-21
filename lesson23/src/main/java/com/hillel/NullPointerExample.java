package com.hillel;

public class NullPointerExample {

  public static void main(String[] args) throws NoMoneyException {
    //ATM atm = new ATM();
    ATM atm = null;
    atm.getMoney(500);
  }

}
