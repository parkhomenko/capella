package com.hillel;

public class BinarySearch {

  public static boolean findNumber(int[] array, int number) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == number) {
        return true;
      }
    }
    return false;
  }

  public static boolean findNumberOptimized(int[] array, int number) {
    int start = 0;
    int end = array.length - 1;

    while (start < end) {
      int middle = (start + end) / 2;
      int element = array[middle];

      if (element == number) {
        return true;
      }

      if (element < number) {
        start = middle + 1;
      } else {
        end = middle - 1;
      }
    }

    return false;
  }
}
