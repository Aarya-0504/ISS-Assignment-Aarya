package com.example.corejava;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModifierTypes {
    private static final Logger logger = LogManager.getLogger(ModifierTypes.class);

    public static void main(String[] args) {
        Example example = new Example();
        example.publicMethod();
        // example.privateMethod(); // Cannot be accessed
        example.protectedMethod();
        example.defaultMethod();
    }
}

class Example {
    private static final Logger logger = LogManager.getLogger(Example.class);

    public void publicMethod() {
        logger.info("Public Method");
    }

    private void privateMethod() {
        logger.info("Private Method");
    }

    protected void protectedMethod() {
        logger.info("Protected Method");
    }

    void defaultMethod() {
        logger.info("Default Method");
    }
}