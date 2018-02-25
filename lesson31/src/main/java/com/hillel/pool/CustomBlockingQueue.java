package com.hillel.pool;

import java.util.LinkedList;
import java.util.Queue;

public class CustomBlockingQueue {

    private Queue<Runnable> queue;
    private int maxSize;

    public CustomBlockingQueue(int maxSize) {
        this.maxSize = maxSize;
        queue = new LinkedList<>();
    }

    public synchronized void addTask(Runnable task) {
        while (queue.size() >= maxSize) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue.add(task);
        notifyAll();
    }

    public synchronized Runnable pollTask() {
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Runnable task = queue.poll();
        notifyAll();
        return task;
    }
}
