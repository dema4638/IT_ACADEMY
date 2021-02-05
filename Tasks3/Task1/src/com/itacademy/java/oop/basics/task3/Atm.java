package com.itacademy.java.oop.basics.task3;

import com.itacademy.java.oop.basics.task3.exceptions.InsuficientAtmFundsException;
import com.itacademy.java.oop.basics.task3.exceptions.NotEnoughtCreditException;

public interface Atm {

    void withdraw(CreditCard creditCard, int amount) throws InsuficientAtmFundsException, NotEnoughtCreditException;
    void withdraw(DebitCard debitCard, int amount) throws InsuficientAtmFundsException;
}
