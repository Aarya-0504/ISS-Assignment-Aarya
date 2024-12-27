package com.example.corejava;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class BankAccount {
    // Declaring and initializing the attributes
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Creating a Logger instance
    private static final Logger logger = LogManager.getLogger(BankAccount.class);

    // Methods to set the account details
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to print all account details
    public void printDetails() {
        logger.info("Bank Account details:");
        logger.info("Account Holder Name: {}", this.accountHolderName);
        logger.info("Account Number: {}", this.accountNumber);
        logger.info("Balance: ${}", this.balance);
    }

    // Methods to demonstrate instance variables
    public void deposit(double amount) {
        this.balance += amount;
        logger.info("Deposited ${}. New balance: ${}", amount, this.balance);
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            logger.warn("Withdrawal of ${} failed. Insufficient balance: ${}", amount, this.balance);
        } else {
            this.balance -= amount;
            logger.info("Withdrew ${}. Remaining balance: ${}", amount, this.balance);
        }
    }
}

public class Basics {
    public static void main(String[] args) {
        // Creating an object of the class BankAccount
        BankAccount account = new BankAccount();

        // Setting the account details
        account.setAccountHolderName("John Doe");
        account.setAccountNumber("123456789");
        account.setBalance(5000.00);

        // Printing initial account details
        account.printDetails();

        // Deposit money
        account.deposit(1500.00);

        // Withdraw money
        account.withdraw(2000.00);

        // Attempt to withdraw more money than available
        account.withdraw(5000.00);

        // Print final account details
        account.printDetails();
    }
}


//Output:
/*
 * 2024-12-25 23:40:22 [main] INFO  com.example.corejava.BankAccount - Bank Account details:
2024-12-25 23:40:22 [main] INFO  com.example.corejava.BankAccount - Account Holder Name: John Doe
2024-12-25 23:40:22 [main] INFO  com.example.corejava.BankAccount - Account Number: 123456789
2024-12-25 23:40:22 [main] INFO  com.example.corejava.BankAccount - Balance: $5000.0
2024-12-25 23:40:22 [main] INFO  com.example.corejava.BankAccount - Deposited $1500.0. New balance: $6500.0
2024-12-25 23:40:22 [main] INFO  com.example.corejava.BankAccount - Withdrew $2000.0. Remaining balance: $4500.0
2024-12-25 23:40:22 [main] WARN  com.example.corejava.BankAccount - Withdrawal of $5000.0 failed. Insufficient balance: $4500.0
2024-12-25 23:40:22 [main] INFO  com.example.corejava.BankAccount - Bank Account details:
2024-12-25 23:40:22 [main] INFO  com.example.corejava.BankAccount - Account Holder Name: John Doe
2024-12-25 23:40:22 [main] INFO  com.example.corejava.BankAccount - Account Number: 123456789
2024-12-25 23:40:22 [main] INFO  com.example.corejava.BankAccount - Balance: $4500.0*/

