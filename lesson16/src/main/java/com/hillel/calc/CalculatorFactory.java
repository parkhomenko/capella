package com.hillel.calc;

public class CalculatorFactory {

  public TipsCalculator createCalculator(String tips) {
    if (tips.equals("bad")) {
      return new BadTipsCalculator();
    }
    if (tips.equals("good")) {
      return new GoodTipsCalculator();
    }
    return null;
  }
}
