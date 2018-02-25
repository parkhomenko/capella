package com.hillel;

public class MainBank implements Runnable {

    private static Account account = new Account();
    //private static Object monitor = new Object();
    private CustomLock customLock = new CustomLock();

    public static void main(String[] args) {

        MainBank mainBank = new MainBank();

        Thread john = new Thread(mainBank);
        Thread hanna = new Thread(mainBank);

        john.start();
        hanna.start();

        System.out.println(account);

    }

    @Override
    public void run() {

        customLock.lock();

        if (account.getMoney() >= 100) {
            account.withdraw(100);
        }

        customLock.unlock();
    }
}
