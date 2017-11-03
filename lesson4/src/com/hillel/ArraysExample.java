package com.hillel;

public class ArraysExample {
    
    public static void main(String[] args) {
        int[] array = new int[10];
        
        //array[0]... array[1]... array[2]...
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
        
        for (int element : array) {
            System.out.println(element);
        }
    }
}