package com.hillel.calc;

public class Main {

  public static void main(String[] args) {

    TipsCalculator goodCalculator = new GoodTipsCalculator();
    TipsCalculator badCalculator = new BadTipsCalculator();

    goodCalculator.calculate(200);
    badCalculator.calculate(200);

    CalculatorFactory calculatorFactory = new CalculatorFactory();
    TipsCalculator calc = calculatorFactory.createCalculator("bad");

  }

}
