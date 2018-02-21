package com.hillel;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SomeClassTest {

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @BeforeClass
  public static void beforeAll() {
    System.out.println("before all");
  }

  @AfterClass
  public static void afterAll() {
    System.out.println("after all");
  }

  @Before
  public void setUp() throws Exception {
    System.out.println("in before");
  }

  @After
  public void tearDown() throws Exception {
    System.out.println("in after");
  }

  @Test
  public void getResult1() throws Exception {
    System.out.println("in test 1");

    int result = SomeClass.getResult(3);
    assertThat(result, is(-2));
  }

  @Test(expected = RuntimeException.class)
  public void getResult2() throws Exception {
    SomeClass.getResult(5);
  }

  @Test
  public void getResult3() throws Exception {
    thrown.expect(RuntimeException.class);
    thrown.expectMessage("Just a test");
    SomeClass.getResult(5);
  }

}