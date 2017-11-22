package com.hillel;

public class ComplexityExample {

  public static int countSumIteratively(int number) {
    int sum = 0;
    for (int i = 1; i <= number; i++) {
      sum += i;
    }
    return sum;
  }

  public static int countSumByFormula(int number) {
    int sum = (1 + number) * number / 2;
    return sum;
  }
}
