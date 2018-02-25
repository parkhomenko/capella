package com.hillel.pool;

public class ThreadPoolMain {

    public static void main(String[] args) {

        int cpus = Runtime.getRuntime().availableProcessors();

        ThreadPool threadPool = new ThreadPool(cpus);
        threadPool.execute(() -> System.out.println("Some task 1"));
        threadPool.execute(() -> System.out.println("Some task 2"));
        threadPool.execute(() -> System.out.println("Some task 3"));
        threadPool.execute(() -> System.out.println("Some task 4"));
        threadPool.execute(() -> System.out.println("Some task 5"));
        threadPool.execute(() -> System.out.println("Some task 6"));
        threadPool.execute(() -> System.out.println("Some task 7"));
        threadPool.execute(() -> System.out.println("Some task 8"));

        threadPool.terminate();
    }
}
