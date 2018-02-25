package com.hillel;

public class CustomLock {

    private boolean locked = false;

    public synchronized void lock() {
        while (locked) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        locked = true;
    }

    public synchronized void unlock() {
        locked = false;
        notify();
    }
}
