package com.example.corejava;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DecisionMaking {
    private static final Logger logger = LogManager.getLogger(DecisionMaking.class);

    public static void main(String[] args) {
        // Example of if-else decision making: Discount eligibility
        double totalPurchase = 150.75;
        if (totalPurchase >= 100) {
            logger.info("You are eligible for a 10% discount.");
        } else {
            logger.info("You are not eligible for a discount.");
        }

        // Example of nested if-else decision making: Loyalty program tier
        int loyaltyPoints = 350;
        if (loyaltyPoints >= 500) {
            logger.info("Loyalty Tier: Gold");
        } else if (loyaltyPoints >= 300) {
            logger.info("Loyalty Tier: Silver");
        } else if (loyaltyPoints >= 100) {
            logger.info("Loyalty Tier: Bronze");
        } else {
            logger.info("Loyalty Tier: Basic");
        }

        // Example of switch-case decision making: Product category
        String productCategory = "Electronics";
        switch (productCategory) {
            case "Electronics":
                logger.info("Category: Electronics - Warranty provided.");
                break;
            case "Clothing":
                logger.info("Category: Clothing - Exchange within 30 days.");
                break;
            case "Groceries":
                logger.info("Category: Groceries - Non-returnable.");
                break;
            case "Furniture":
                logger.info("Category: Furniture - Assembly required.");
                break;
            default:
                logger.info("Category: Other - Check with customer service.");
        }

        // Another switch-case example with fall-through: Day-based discount offers
        String dayOfWeek = "Wednesday";
        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
                logger.info("Weekday Offer: 5% off on all items.");
                break;
            case "Wednesday":
            case "Thursday":
                logger.info("Midweek Offer: Buy 1 Get 1 Free on selected items.");
                break;
            case "Friday":
                logger.info("Weekend Offer starts tomorrow!");
                break;
            case "Saturday":
            case "Sunday":
                logger.info("Weekend Offer: 15% off on all items.");
                break;
            default:
                logger.info("Invalid day. No offers available.");
        }
    }
}

//Output:
//	2024-12-26 11:52:19 [main] INFO  com.example.corejava.DecisionMaking - You are eligible for a 10% discount.
//	2024-12-26 11:52:19 [main] INFO  com.example.corejava.DecisionMaking - Loyalty Tier: Silver
//	2024-12-26 11:52:19 [main] INFO  com.example.corejava.DecisionMaking - Category: Electronics - Warranty provided.
//	2024-12-26 11:52:19 [main] INFO  com.example.corejava.DecisionMaking - Midweek Offer: Buy 1 Get 1 Free on selected items.