package com.hillel;

public class SimpleIf {
    
    public static void main(String... args) {
        
        byte a = 5;
        byte b = 12;
        
        byte max = calculateMaximum(a, b);
        
        System.out.println("Maximum: " + max);
        
    }
    
    public static byte calculateMaximum(byte a, byte b) {
        return a > b ? a : b;
    }
}