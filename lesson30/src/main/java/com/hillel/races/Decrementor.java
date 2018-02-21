package com.hillel.races;

public class Decrementor implements Runnable {

  private Counter counter;

  public Decrementor(Counter counter) {
    this.counter = counter;
  }

  @Override
  public void run() {
    for (int i = 0; i < 1000; i++) {
      counter.decrement();
    }
  }
}
