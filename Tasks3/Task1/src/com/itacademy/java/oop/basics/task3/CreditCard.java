package com.itacademy.java.oop.basics.task3;

import com.itacademy.java.oop.basics.task3.exceptions.NotEnoughtCreditException;

public class CreditCard extends Card{
    private double interest;
    private final double credit;

    public CreditCard(double interest, double credit, double balance, String name, String number) {
        super(balance, name, number);
        this.interest = interest;
        this.credit = credit;
    }


    @Override
    void debit(double amount) throws NotEnoughtCreditException {
        double newBalance = balance - amount;
        if (newBalance < 0 && newBalance < credit){
            throw new NotEnoughtCreditException("Not enough credit.");
        }else{
            balance = newBalance;
        }
    }

    public double getInterest() {
        return interest;
    }

    public double getCredit() {
        return credit;
    }

    @Override
    public String toString() {
        return String.format("CreditCard[ cardHolderName = %s, cardNumber = %s, balance = %s, interest = %s, credit = %s]",
                cardHolderName, cardNumber, balance, interest, credit);
    }
}
