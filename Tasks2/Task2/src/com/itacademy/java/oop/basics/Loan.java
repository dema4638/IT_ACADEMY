package com.itacademy.java.oop.basics;

public class Loan {
    private int id;
    private int amount;
    private String loanType;
    private String terminationDate;

    public Loan(int id, int amount, String loanType, String terminationDate){
        this.id = id;
        this.amount = amount;
        this.loanType = loanType;
        this.terminationDate = terminationDate;
    }

    public int getAmount(){
        return amount;
    }

    public String getLoanInfo(){
        return "Loan{" +
                "id'" + id + '\'' +
                ", amount='" + amount + '\'' +
                ", loanType=" + loanType +
                ", terminationDate=" + terminationDate +
                '}';
    }
}
