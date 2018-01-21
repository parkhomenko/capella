package com.hillel;

public class MainATM {

  public static void main(String[] args) {
    int result = getMoneyFromATM();
    System.out.println(result);
  }

  public static int getMoneyFromATM() {

    try (ATM atm = new ATM()) {
      atm.getMoney(500);
      return 0;
    } catch (NoMoneyException e) {
      e.printStackTrace();
      return 1;
    } catch (Exception e) {
      e.printStackTrace();
      return 2;
    }

  }

}
