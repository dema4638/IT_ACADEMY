package com.itacademy.java.oop.basics;

public class LoansApplication {
    public static void main(String[] args) {
        Loan[] loans = new Loan[2];
        Customer customer = new Customer("Vardas", "Pavarde", 30, 123);
          Loan loan1 = new Loan(1, 100, LoanType.LEASING.getDisplayValue(), "2020 01 02");
          Loan loan2 = new Loan(2, 100, LoanType.CONSUMER.getDisplayValue(), "2020 01 02");
          customer.addLoans(loan1, loan2);
          System.out.println(customer.toString());



    }
}
