package com.example.corejava;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

interface Shape {
    void draw();
}

class Rectangle implements Shape {
    private static final Logger logger = LogManager.getLogger(Rectangle.class);

    @Override
    public void draw() {
        logger.info("Drawing a Rectangle");
    }
}

public class Interfaces {
    private static final Logger logger = LogManager.getLogger(Interfaces.class);

    public static void main(String[] args) {
        // Using the Shape interface to refer to an object of Rectangle class
        Shape shape = new Rectangle();
        shape.draw();  // Calls the draw method of the Rectangle class
    }
}

//Output:
//	2024-12-26 14:08:01 [main] INFO  com.example.corejava.Rectangle - Drawing a Rectangle