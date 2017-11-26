package com.hillel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberConverterTest {

    @Test
    public void shouldConvertDecimalToBinary() {
        String result = NumberConverter.decimalToBinary(234);
        assertEquals("11101010", result);
    }

    @Test
    public void shouldConvertToZero() {
        String result = NumberConverter.decimalToBinary(0);
        assertEquals("0", result);
    }
}
