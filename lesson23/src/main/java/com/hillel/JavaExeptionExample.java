package com.hillel;

import java.io.FileNotFoundException;

public class JavaExeptionExample {

  public static void main(String[] args) {
    /*try {
      getResource();
      System.out.println("end of try");
    } catch (NetworkUnreachableException ex) {
      System.out.println(ex.getMessage());
    } catch (FileNotFoundException ex) {
      System.out.println(ex.getMessage());
    }*/

    /*try {
      getResource();
      System.out.println("end of try");
    } catch (NetworkUnreachableException | FileNotFoundException ex) {
      System.out.println(ex.getMessage());
    }*/

    try {
      getResource();
      System.out.println("end of try");
    } catch (Exception ex) {
      ex.printStackTrace();
    } finally {
      System.out.println("finally");
    }

    System.out.println("out of try block");
  }

  public static void getResource() throws NetworkUnreachableException, FileNotFoundException {

    if (!networkIsOk()) {
      throw new NetworkUnreachableException("Network can't be reached");
    }

    if (fileNotFound()) {
      throw new FileNotFoundException("Can't find requested file");
    }
  }

  private static boolean fileNotFound() {
    return true;
  }

  private static boolean networkIsOk() {
    return false;
  }

}
