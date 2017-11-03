package com.hillel;

public class SumOfNumbers {
    
    public static void main(String... args) {
        
        int sum = 0;
        /*
        for (int i = 0; i < args.length; i++) {
            System.out.println(i + " parameter: " + args[i]);
            sum += Integer.parseInt(args[i]);
        }
        */
        
        for (String elem : args) {
            System.out.println("Parameter: " + elem);
            sum += Integer.parseInt(elem);
        }
        
        System.out.println("Sum of numbers: " + sum);
    }
}