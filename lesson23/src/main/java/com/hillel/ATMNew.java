package com.hillel;

public class ATMNew {

  private int totalMoney;

  public ATMNew() {
    totalMoney = 500;
  }

  public boolean hasEnoughMoney(int money) {
    return totalMoney >= money;
  }

  /**
   * @throws NoMoneyExceptionNew You'll get an exception when no money in ATM
   * @param money
   */
  public void getMoney(int money) {
    if (money > totalMoney) {
      throw new NoMoneyExceptionNew("No money in ATM");
    }
    totalMoney -= money;
  }

}
