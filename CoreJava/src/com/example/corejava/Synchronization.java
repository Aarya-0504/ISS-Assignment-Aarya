package com.example.corejava;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Counter {
    private static final Logger logger = LogManager.getLogger(Counter.class);

    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class MyThread2 extends Thread {
    private static final Logger logger = LogManager.getLogger(MyThread2.class);

    private Counter counter;

    public MyThread2(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class Synchronization {
    private static final Logger logger = LogManager.getLogger(Synchronization.class);

    public static void main(String[] args) {
        Counter counter = new Counter();

        MyThread2 thread1 = new MyThread2(counter);
        MyThread2 thread2 = new MyThread2(counter);
        MyThread2 thread3 = new MyThread2(counter);
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            logger.error("Thread interrupted: {}", e.getMessage());
        }

        logger.info("Final Count: {}", counter.getCount());
    }
}