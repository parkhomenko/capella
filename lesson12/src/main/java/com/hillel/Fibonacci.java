package com.hillel;

public class Fibonacci {

  public static int[] cache = new int[500];
  public static int max = 0;

  public static void main(String[] args) {
    int n = 9;
    int result = fibonacci(n);
    System.out.println(result);

    if (n <= max) {
      System.out.println(cache[n]);
    } else {
      result = fibonacci(n);
      System.out.println(result);
    }
  }

  public static int fibonacci(int n) {
    int f1 = 1;
    int f2 = 1;
    int f3 = 1;
    cache[1] = 1;
    cache[2] = 1;
    for (int i = 3; i <= n; i++) {
      f3 = f1 + f2;
      cache[i] = f3;
      f1 = f2;
      f2 = f3;
    }
    max = n;
    return f3;
  }

}
