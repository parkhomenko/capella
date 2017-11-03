package com.hillel;

public class Test {
    public static void main(String... args) {
      int a = 10;
        int b = 15;
      
        int c=3;
        
        /*
        if (a > b) {
            if (c > a) {
                System.out.println(c);
            } else {
                System.out.println(a);
            }
        } else {
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
        */
        
        int max = (a > b &&a > c) ? a :(b >c ?    b : c);
    }
}