package com.itacademy.java.oop.basics.task3;

import com.itacademy.java.oop.basics.task3.exceptions.NotEnoughBalanceException;

public class DebitCard extends Card{

    public DebitCard(double balance, String name, String number) {
        super(balance, name, number);
    }


    @Override
    void debit(double amount) throws NotEnoughBalanceException {
        double newBalance = balance - amount;
        if (newBalance < 0){
            throw new NotEnoughBalanceException("Not enough balance.");
        }else{
            balance = newBalance;
        }
    }

    @Override
    public String toString() {
        return String.format("DebitCard[ cardHolderName = %s, cardNumber = %s, balance = %s]",
                cardHolderName, cardNumber, balance);
    }

}
