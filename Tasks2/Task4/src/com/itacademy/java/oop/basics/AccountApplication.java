package com.itacademy.java.oop.basics;

public class AccountApplication {
    public static void main(String[] args) {
        Account account1 = new Account("123", "Vardas1", 100);
        Account account2 = new Account("000", "Vardas2", 50);
        account1.credit(10);
        account1.credit(20);
        System.out.println(account1.getBalance());
        account2.credit(10);
        System.out.println(account2.getBalance());
        account1.debit(500);
        account2.transferTo(account1,70);
        account1.debit(30);
        System.out.println(account1.getBalance());
        account1.transferTo(account2,10);
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println(account1.toString());
        System.out.println(account2.toString());


    }
}
