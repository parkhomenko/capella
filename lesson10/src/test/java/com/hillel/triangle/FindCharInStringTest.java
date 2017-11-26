package com.hillel.triangle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FindCharInStringTest {

  @Test
  public void testCount() {
    int result = FindCharInString.count("Hello World", 'l');
    assertThat(result, is(3));
  }

}
