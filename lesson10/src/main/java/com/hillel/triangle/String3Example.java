package com.hillel.triangle;

public class String3Example {

  public static void main(String[] args) {
    String str = "HELLO";
    str = str.toLowerCase();
    System.out.println(str);

    String str1 = "Hello World";
    str1.replace("Hello", "Goodbye");
    System.out.println(str1);

    String str2 = "    he  llo   ";
    str2 = str2.trim();
    System.out.println(str2);

    String str3 = "one,two,three";
    String[] strArray = str3.split(",");

    String str5 = "    \"Hello\"        ";
    int count = 2;
    String str4 = getHello(str5, count);
  }

  private static String getHello(String str, int count) {
    count = 1;
    str = str.trim();
    return str;
  }

}
