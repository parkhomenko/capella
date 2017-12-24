package com.hillel;

import java.util.NoSuchElementException;

public class CustomStack {

  private static final int DEFAULT_CAPACITY = 10;
  private int[] array;
  private int[] minArray;
  private int minimum;

  public CustomStack() {
    this(DEFAULT_CAPACITY);
  }

  public CustomStack(int capacity) {
    array = new int[capacity];
    minArray = new int[capacity];
  }

  public void push(int element) {

  }

  public int pop() {
    return 0;
  }

  public int peek() {
    return 0;
  }

  public int min() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }

    return minimum;
  }

  public boolean isEmpty() {
    return false;
  }

  public int size() {
    return 0;
  }

}
