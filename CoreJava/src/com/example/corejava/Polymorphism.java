package com.example.corejava;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Animal2 {
    protected static final Logger logger = LogManager.getLogger(Animal2.class);

    public void makeSound() {
        logger.info("Some generic animal sound");
    }
}

class Dog2 extends Animal2 {
    @Override
    public void makeSound() {
        logger.info("Dog barks");
    }
}

class Cat2 extends Animal2 {
    @Override
    public void makeSound() {
        logger.info("Cat meows");
    }
}

public class Polymorphism {
    private static final Logger logger = LogManager.getLogger(Polymorphism.class);

    public static void main(String[] args) {
        Animal2 myAnimal = new Dog2();
        myAnimal.makeSound();

        myAnimal = new Cat2();
        myAnimal.makeSound();
    }
}