package com.hillel;

public class SumOfNumbers {

  public static void main(String[] args) {
    int result = sumOfNumbers(5);
    System.out.println(result);
  }

  public static int sumOfNumbers(int number) {
    if (number == 1) {
      return 1;
    }

    return sumOfNumbers(number - 1) + number;
  }

}
