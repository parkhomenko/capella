package com.hillel.races;

public class Incrementor implements Runnable {

  private Counter counter;

  public Incrementor(Counter counter) {
    this.counter = counter;
  }

  @Override
  public void run() {
    for (int i = 0; i < 1000; i++) {
      counter.increment();
    }
  }
}
