package com.hillel;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class CollectionsExample {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> map1 =
                Collections.synchronizedMap(map);

        ConcurrentMap<Integer, String> concurrentHashMap =
                new ConcurrentHashMap<>();
    }
}
