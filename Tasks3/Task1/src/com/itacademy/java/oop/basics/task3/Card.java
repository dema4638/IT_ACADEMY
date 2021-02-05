package com.itacademy.java.oop.basics.task3;

public abstract class Card {
    protected double balance;
    protected String cardHolderName;
    protected String cardNumber;

    public Card(double balance, String cardHolderName, String cardNumber) {
        this.balance = balance;
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
    }

    void credit(double amount){
        this.balance += amount;
    };

    abstract void debit(double amount) throws Exception;

    public double getBalance() {
        return this.balance;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
