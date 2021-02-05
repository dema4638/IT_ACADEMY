package com.itacademy.java.oop.basics.task3;

import com.itacademy.java.oop.basics.task3.exceptions.InsuficientAtmFundsException;
import com.itacademy.java.oop.basics.task3.exceptions.NotEnoughtCreditException;

public class AtmApplication {

    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard(1, 50, 400, "Vardas1", "Credit1");
        DebitCard debitCard = new DebitCard(400, "Vardas1", "Debit1");
        System.out.println(debitCard.getBalance());
        System.out.println(creditCard.getBalance());
        creditCard.credit(100);
        System.out.println(creditCard.getBalance());

        System.out.println(debitCard.getBalance());
        MyBankAtm myBankAtm = new MyBankAtm(200);

        try {
            myBankAtm.withdraw(debitCard, 300);
        } catch (InsuficientAtmFundsException e) {
            e.printStackTrace();
        }

        try {
            myBankAtm.withdraw(creditCard, 50);
        } catch (InsuficientAtmFundsException | NotEnoughtCreditException e) {
            e.printStackTrace();
        }

        System.out.println(debitCard.toString());
        System.out.println(creditCard.toString());

    }
}
