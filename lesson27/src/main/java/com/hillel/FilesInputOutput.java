package com.hillel;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FilesInputOutput {

  public static void main(String[] args) {
    String file = "C:\\Users\\User\\Projects\\lesson27\\test.txt";

    int[] symbols = readFile(file);

    System.out.println(Arrays.toString(symbols));

    writeFile(symbols, "C:\\Users\\User\\Projects\\lesson27\\test_out.txt");
  }

  public static void writeFile(int[] symbols, String path) {
    File file = new File(path);

    FileWriter fileWriter = null;
    try {
      fileWriter = new FileWriter(file);

      for (int symbol : symbols) {
        fileWriter.write(symbol);
      }

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        fileWriter.flush();
        fileWriter.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  public static int[] readFile(String path) {
    File file = new File(path);

    try (FileReader fileReader = new FileReader(file)) {

      int[] symbols = new int[(int)file.length()];

      int symbol;
      int i = 0;
      while ((symbol = fileReader.read()) != -1) {
        symbols[i++] = symbol;
      }

      return symbols;

    } catch (IOException ex) {
      ex.printStackTrace();
    }

    return null;
  }
}
