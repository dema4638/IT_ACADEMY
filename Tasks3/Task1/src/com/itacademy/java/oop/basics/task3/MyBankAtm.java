package com.itacademy.java.oop.basics.task3;

import com.itacademy.java.oop.basics.task3.exceptions.InsuficientAtmFundsException;
import com.itacademy.java.oop.basics.task3.exceptions.NotEnoughtCreditException;

public class MyBankAtm implements Atm {
    private double balance;

    public MyBankAtm(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(CreditCard creditCard, int amount) throws InsuficientAtmFundsException, NotEnoughtCreditException {
        double interest;
        if (amount > balance){
            throw new InsuficientAtmFundsException("The funds in ATM are insufficient");
        }else{
            interest = creditCard.getInterest() * amount / 100;
            creditCard.debit(amount);
            creditCard.debit(interest);
        }
    }

    @Override
    public void withdraw(DebitCard debitCard, int amount) throws InsuficientAtmFundsException{
        if (amount > balance){
            throw new InsuficientAtmFundsException("The funds in ATM are insufficient");
        }else{
            debitCard.credit(amount);
        }
    }
}
