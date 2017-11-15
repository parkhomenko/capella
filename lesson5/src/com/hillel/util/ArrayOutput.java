package com.hillel.util;

public class ArrayOutput {
    
    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " строка: ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}