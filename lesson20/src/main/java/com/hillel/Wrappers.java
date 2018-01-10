package com.hillel;

public class Wrappers {

  public static void main(String[] args) {

    int number = 5;

    //Integer num = Integer.valueOf(5);
    Integer num = number; //boxing

    //int numUnboxed = num.intValue();
    int numUnboxed = num; //unboxing

  }

}
