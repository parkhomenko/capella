package com.hillel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BinarySearchTest {

  @Test
  public void testBinarySearch() {
    int[] array = {2, 5, 6, 7, 9, 13, 27};
    int number = 27;

    boolean result = BinarySearch.findNumberOptimized(array, number);
    assertThat(result, is(true));
  }

}
