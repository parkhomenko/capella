package com.hillel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExceptionExample {

  public static void main(String[] args) {
    File file = new File("c:\\1.txt");

    FileReader fileReader = null;
    try {
      fileReader = new FileReader(file);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } finally {
      try {
        fileReader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  public void tryWithResourcesExample() {
    File file = new File("c:\\1.txt");

    try (FileReader fileReader = new FileReader(file)) {

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
