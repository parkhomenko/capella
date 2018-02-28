package com.hillel;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinExample {

    public static void main(String[] args) {

        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i;
        }
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        RecursiveActionTask task = new RecursiveActionTask(array, 0, array.length);

        int sum = forkJoinPool.invoke(task);

        System.out.println(sum);
    }
}
