package com.hillel.races;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

  private AtomicInteger value = new AtomicInteger();
  //private Object lock = new Object();

  public void increment() {
    /*synchronized (lock) {
      value++;
    }*/

    /*synchronized (this) {
      value++;
    }*/

    value.incrementAndGet();
  }

  public void decrement() {
    /*synchronized (lock) {
      value--;
    }*/

    /*synchronized (this) {
      value--;
    }*/

    value.decrementAndGet();
  }

  public int getValue() {
    return value.intValue();
  }

}
