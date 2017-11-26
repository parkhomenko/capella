package com.hillel.triangle;

import java.util.stream.Stream;

public class StringBuilderExample {

  public static void main(String[] args) {
    String str = "Hello"
      + " World";
    System.out.println(str);

    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Hello");
    stringBuilder.append(" World");

    String str1 = "Hello";
    for (int i = 0; i < 5; i++) {
      str1 += i;
    }

    long cnt = str.chars()
        .filter(e -> e == 'l')
        .count();
    System.out.println(cnt);
  }
}
