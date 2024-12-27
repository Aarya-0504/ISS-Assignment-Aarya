package com.example.corejava;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FinalKeyword {
    private static final Logger logger = LogManager.getLogger(FinalKeyword.class);

    private final String constantValue = "This is a constant string";

    public void displayConstant() {
        logger.info("Constant Value: {}", constantValue);
    }

    public static void main(String[] args) {
    	FinalKeyword example = new FinalKeyword();
        example.displayConstant();
    }
}
