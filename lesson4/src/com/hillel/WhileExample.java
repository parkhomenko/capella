package com.hillel;

public class WhileExample {
    
    public static void main(String... args) {
        
        int i = 0;
        while (i < 10) {
            System.out.println("Hello World: " + i++);
            //i++; // i = i + 1;
        }
        
        
    }
    
    public boolean isEven(int number) {
        /*
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
        */
        return number % 2 == 0;
    }
}