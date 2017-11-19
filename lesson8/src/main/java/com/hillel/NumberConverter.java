package com.hillel;

public class NumberConverter {


    public static String decimalToBinary(int i) {
        String result = "";

        do {
            int rem = i % 2;
            result = rem + result;
            i = i / 2;
        } while (i > 0);

        return result;
    }
}
