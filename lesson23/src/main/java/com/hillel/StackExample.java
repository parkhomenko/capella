package com.hillel;

public class StackExample {

  public static void main(String[] args) {
    try {
      func1();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void func1() throws Exception {
    func2();
  }

  private static void func2() throws Exception {
    func3();
  }

  private static void func3() throws Exception {
    System.out.println("asdfsdaf");
    //throw new RuntimeException();
    throw new Exception("test");
  }

}
