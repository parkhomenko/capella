package com.hillel.threads;

public class ThreadExample {

  public static void main(String[] args) throws InterruptedException {

    /*Task task = new Task();
    task.setName("MyThread");
    task.setPriority(Thread.MIN_PRIORITY);
    task.setDaemon(false);
    task.start();*/

    AnotherTask anotherTask = new AnotherTask();
    Thread thread = new Thread(anotherTask);
    thread.start();

    //throw new RuntimeException();

    //task.join();

    for (int i = 0; i < 10; i++) {
      //Thread.yield();
      Thread.sleep(1);
      System.out.println(Thread.currentThread().getName() + ": " + i);
    }
  }

}
