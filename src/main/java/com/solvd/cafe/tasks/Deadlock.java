package com.solvd.cafe.tasks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Deadlock {

    public static void startDeadlock() {

        final Logger logger = LogManager.getLogger(Deadlock.class);

        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread thread1 = new Thread(() -> {
            logger.info(Thread.currentThread().getName() + " Start");
            synchronized (lock1) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                }
            }
            logger.info(Thread.currentThread().getName() + " End");
        }, "Thread1");

        Thread thread2 = new Thread(() -> {
            logger.info(Thread.currentThread().getName() + " start");
            synchronized (lock2) {
                synchronized (lock1) {
                }
            }
            logger.info(Thread.currentThread().getName() + " end");
        }, "Thread2");
        thread1.start();
        thread2.start();
    }
}
