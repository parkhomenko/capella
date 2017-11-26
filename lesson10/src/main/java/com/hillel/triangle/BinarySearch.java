package com.hillel.triangle;

import java.math.BigInteger;

public class BinarySearch {

  public static void main(String[] args) {

    int start = Integer.MAX_VALUE;
    int end = 50;

    int mid = end + (start - end) / 2;

    System.out.println(mid);
    long middleCorrect = (long)Integer.MAX_VALUE + (long)end;
    System.out.println(middleCorrect / 2);

    int middle = (start + end) >>> 1;

    System.out.println(middle);
  }

}
