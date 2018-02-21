package com.hillel.threads;

public class AnotherTask implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      try {
        Thread.sleep(10);
        System.out.println(Thread.currentThread().getName() + ": " + i);

      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
