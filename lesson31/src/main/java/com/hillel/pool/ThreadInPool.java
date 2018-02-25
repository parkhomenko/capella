package com.hillel.pool;

public class ThreadInPool implements Runnable {

    private boolean finished = false;
    private CustomBlockingQueue queue;

    public ThreadInPool(CustomBlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (!finished) {
            Runnable task = queue.pollTask();
            task.run();
        }
    }

    public void stop() {
        finished = true;
    }
}
