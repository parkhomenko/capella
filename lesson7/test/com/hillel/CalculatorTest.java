package com.hillel;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

  @Test
  public void shouldAddNumbers() {
    int result = Calculator.add(5, 7);

    assertEquals(12, result);
  }

  @Test
  public void shouldSubtractNumbers() {
    int result = Calculator.subtract(9, 7);

    assertEquals(2, result);
  }
}
