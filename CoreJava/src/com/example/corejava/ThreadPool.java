package com.example.corejava;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    private static final Logger logger = LogManager.getLogger(Task.class);

    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        logger.info("Executing Task: {}", name);
    }
}

public class ThreadPool {
    private static final Logger logger = LogManager.getLogger(ThreadPool.class);

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 5; i++) {
            Task task = new Task("Task" + i);
            executor.execute(task);
        }

        executor.shutdown();
    }
}

//2024-12-26 15:36:37 [pool-2-thread-1] INFO  com.example.corejava.Task - Executing Task: Task1
//2024-12-26 15:36:37 [pool-2-thread-2] INFO  com.example.corejava.Task - Executing Task: Task2
//2024-12-26 15:36:37 [pool-2-thread-1] INFO  com.example.corejava.Task - Executing Task: Task3
//2024-12-26 15:36:37 [pool-2-thread-2] INFO  com.example.corejava.Task - Executing Task: Task4
//2024-12-26 15:36:37 [pool-2-thread-1] INFO  com.example.corejava.Task - Executing Task: Task5