package com.hillel;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runtime runtime = Runtime.getRuntime();
        int cpus = runtime.availableProcessors();

        System.out.println(cpus);

        ExecutorService executorService =
                Executors.newFixedThreadPool(cpus);

        executorService.execute(() -> System.out.println("Some task"));

        Future<Integer> result = executorService.submit(new SomeTask());

        int sum = result.get();

        System.out.println(sum);

        executorService.shutdown();
    }
}
