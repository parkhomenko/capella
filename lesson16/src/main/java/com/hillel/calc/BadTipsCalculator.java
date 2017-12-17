package com.hillel.calc;

public class BadTipsCalculator extends TipsCalculator {

  public int calculate(int sum) {
    return (int)(sum * 1.05);
  }

}
