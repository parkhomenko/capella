package com.hillel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FilesBufferedInputOutput {

  public static void main(String[] args) {
    String file = "C:\\Users\\User\\Projects\\lesson27\\test.txt";

    Map<String, Integer> map = readFile(file);
    writeFile("C:\\Users\\User\\Projects\\lesson27\\test_out.txt", map);
  }

  public static void writeFile(String path, Map<String, Integer> map) {
    File file = new File(path);

    FileWriter fileWriter;
    BufferedWriter bufferedWriter = null;

    try {
      fileWriter = new FileWriter(file);
      bufferedWriter = new BufferedWriter(fileWriter);
      /*Set<String> keys = map.keySet();
      for (String word : keys) {
        String line = word + " " + map.get(word);
        bufferedWriter.write(line);
        bufferedWriter.newLine();
      }*/
      Set<Entry<String, Integer>> entries = map.entrySet();
      for (Entry<String, Integer> entry : entries) {
        String line = entry.getKey() + " " + entry.getValue();
        bufferedWriter.write(line);
        bufferedWriter.newLine();
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    } finally {
      try {
        bufferedWriter.flush();
        bufferedWriter.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  public static Map<String, Integer> readFile(String path) {
    File file = new File(path);

    Map<String, Integer> map = new HashMap<>();

    FileReader fileReader;
    BufferedReader bufferedReader = null;
    try {
      fileReader = new FileReader(file);
      bufferedReader = new BufferedReader(fileReader);
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        String[] words = line.split(" ");
        for (String word : words) {
          if (map.containsKey(word)) {
            int value = map.get(word);
            value++;
            map.put(word, value);
          } else {
            map.put(word, 1);
          }
        }
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    } finally {
      try {
        bufferedReader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    return map;
  }
}
