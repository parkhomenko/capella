package com.hillel.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ThreadPool {

    CustomBlockingQueue customBlockingQueue;
    List<ThreadInPool> threads = new ArrayList<>();

    public ThreadPool(int numberOfThreads) {
        customBlockingQueue = new CustomBlockingQueue(10);

        for (int i = 0; i < numberOfThreads; i++) {
            ThreadInPool threadInPool = new ThreadInPool(customBlockingQueue);
            threads.add(threadInPool);
            Thread thread = new Thread(threadInPool);
            thread.start();
        }
    }

    public void execute(Runnable task) {
        customBlockingQueue.addTask(task);
    }

    public void terminate() {
        /*for (ThreadInPool threadInPool : threads) {
            threadInPool.stop();
        }*/

        threads.forEach(e -> e.stop());

        //threads.forEach(ThreadInPool::stop);
    }
}
