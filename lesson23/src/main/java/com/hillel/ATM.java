package com.hillel;

public class ATM implements AutoCloseable {

  private int totalMoney;

  public ATM() {
    totalMoney = 500;
  }

  public void getMoney(int money) throws NoMoneyException {
    if (money > totalMoney) {
      throw new NoMoneyException("No money in ATM");
    }
    totalMoney -= money;
  }

  @Override
  public void close() throws Exception {
    totalMoney = 0;
  }
}
