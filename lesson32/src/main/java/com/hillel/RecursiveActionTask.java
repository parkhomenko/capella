package com.hillel;

import java.util.concurrent.RecursiveTask;

public class RecursiveActionTask extends RecursiveTask<Integer> {

    private int[] array;
    private int start;
    private int end;

    public RecursiveActionTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= 25) {
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            return sum;
        }

        int middle = (end + start) / 2;

        RecursiveActionTask leftTask = new RecursiveActionTask(array, start, middle);
        leftTask.fork();

        RecursiveActionTask rightTask = new RecursiveActionTask(array, middle, end);
        int sum2 = rightTask.compute();

        int sum1 = leftTask.join();

        return sum1 + sum2;
    }
}
