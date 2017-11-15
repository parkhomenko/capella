package com.hillel;

import com.hillel.util.ArrayOutput;

public class Main {
    
    public static void main(String... args) {
        int[][] array = new int[2][3];
        
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;
        
        ArrayOutput.print(array);
    }
    
    public static void createArray() {
        int[][] array = new int[3][];
        
        array[0] = new int[3];
        array[1] = new int[2];
        array[2] = new int[5];
    }
    
}