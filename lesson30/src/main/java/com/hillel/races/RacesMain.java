package com.hillel.races;

public class RacesMain {

  public static void main(String[] args) throws InterruptedException {

    Counter counter = new Counter();

    Thread incrementor = new Thread(new Incrementor(counter));
    Thread decrementor = new Thread(new Decrementor(counter));

    incrementor.start();
    decrementor.start();

    incrementor.join();
    decrementor.join();

    System.out.println(counter.getValue());
  }

}
