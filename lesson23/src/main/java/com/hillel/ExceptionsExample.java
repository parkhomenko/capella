package com.hillel;

public class ExceptionsExample {

  public static void main(String[] args) {
    int status = getResource();

    if (status == 0) {
      //....
    } else {
      if (status == -1) {
        System.out.println("network can't be reached at the moment");
      } else {
        System.out.println("file not found");
      }
    }
  }

  public static int getResource() {

    if (!networkIsOk()) {
      return -1;
    }

    if (fileNotFound()) {
      return -2;
    }

    return 0;
  }

  private static boolean fileNotFound() {
    return false;
  }

  private static boolean networkIsOk() {
    return false;
  }

}
