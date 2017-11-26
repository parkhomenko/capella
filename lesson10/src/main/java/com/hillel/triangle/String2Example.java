package com.hillel.triangle;

public class String2Example {

  public static void main(String[] args) {
    String str1 = "Hello";
    String str2 = "Hello";
    String str3 = new String("Hello");
    String str4 = str3.intern();
    str3 = "Goodbye";
    String str8 = str3;
    str3 = "Привет";
    str1 = new String("Hello");

    System.out.println(str1 == str2);
    System.out.println(str1.equals(str2));


  }

}
