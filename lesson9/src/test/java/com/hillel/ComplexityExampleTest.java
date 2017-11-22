package com.hillel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.hamcrest.Matcher;
import org.junit.Test;

public class ComplexityExampleTest {

  @Test
  public void shouldReturnCorrectSum() {
    long before = System.nanoTime();

    int sum = ComplexityExample.countSumIteratively(100);

    long after = System.nanoTime();

    System.out.println(after - before);

    assertThat(sum, is(5050));
  }

  @Test
  public void shouldReturnCorrectSumByFormula() {
    long before = System.nanoTime();

    int sum = ComplexityExample.countSumByFormula(100);

    long after = System.nanoTime();

    System.out.println(after - before);

    assertThat(sum, is(5050));
  }

}
