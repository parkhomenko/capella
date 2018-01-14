package com.hillel.enums;

public enum EnumSingleton {
  INSTANCE;

  public void hello() {
    System.out.println("Hello singleton");
  }
}
