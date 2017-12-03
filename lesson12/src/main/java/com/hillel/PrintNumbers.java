package com.hillel;

public class PrintNumbers {

  public static void main(String[] args) {
    printNumber1(1);
  }

  public static void printNumber1(int number) {
    if (number == 5) {
      return;
    }

    System.out.println(number);
    number++;
    printNumber1(number);
  }

}
