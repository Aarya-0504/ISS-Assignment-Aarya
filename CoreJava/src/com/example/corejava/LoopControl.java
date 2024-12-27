package com.example.corejava;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoopControl {
    private static final Logger logger = LogManager.getLogger(LoopControl.class);

    public static void main(String[] args) {
        logger.info("For Loop:");
        for (int i = 0; i < 5; i++) {
            logger.info("i: {}", i);
        }

        logger.info("While Loop:");
        int j = 0;
        while (j < 5) {
            logger.info("j: {}", j);
            j++;
        }

        logger.info("Do-While Loop:");
        int k = 0;
        do {
            logger.info("k: {}", k);
            k++;
        } while (k < 5);
    }
}

//Output:
//	2024-12-26 11:49:56 [main] INFO  com.example.corejava.LoopControl - For Loop:
//		2024-12-26 11:49:56 [main] INFO  com.example.corejava.LoopControl - i: 0
//		2024-12-26 11:49:56 [main] INFO  com.example.corejava.LoopControl - i: 1
//		2024-12-26 11:49:56 [main] INFO  com.example.corejava.LoopControl - i: 2
//		2024-12-26 11:49:56 [main] INFO  com.example.corejava.LoopControl - i: 3
//		2024-12-26 11:49:56 [main] INFO  com.example.corejava.LoopControl - i: 4
//		2024-12-26 11:49:56 [main] INFO  com.example.corejava.LoopControl - While Loop:
//		2024-12-26 11:49:56 [main] INFO  com.example.corejava.LoopControl - j: 0
//		2024-12-26 11:49:56 [main] INFO  com.example.corejava.LoopControl - j: 1
//		2024-12-26 11:49:56 [main] INFO  com.example.corejava.LoopControl - j: 2
//		2024-12-26 11:49:56 [main] INFO  com.example.corejava.LoopControl - j: 3
//		2024-12-26 11:49:56 [main] INFO  com.example.corejava.LoopControl - j: 4
//		2024-12-26 11:49:56 [main] INFO  com.example.corejava.LoopControl - Do-While Loop:
//		2024-12-26 11:49:56 [main] INFO  com.example.corejava.LoopControl - k: 0
//		2024-12-26 11:49:56 [main] INFO  com.example.corejava.LoopControl - k: 1
//		2024-12-26 11:49:56 [main] INFO  com.example.corejava.LoopControl - k: 2
//		2024-12-26 11:49:56 [main] INFO  com.example.corejava.LoopControl - k: 3
//		2024-12-26 11:49:56 [main] INFO  com.example.corejava.LoopControl - k: 4