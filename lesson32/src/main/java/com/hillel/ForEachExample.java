package com.hillel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

    public static void main(String[] args) {
        /*List<String> list =
                new ArrayList<>(Arrays.asList("First", "Second", "Third"));*/
        List<String> list = List.of("First", "Second", "Third");
        /*for (String item : list) {
            System.out.println(item);
        }*/

        //list.forEach(e -> System.out.println(e));
        list.forEach(System.out::println);
    }
}
