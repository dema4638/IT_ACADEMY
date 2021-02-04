package com.itacademy.java.oop.basics;

public class Customer {
    private String name;
    private String surname;
    private int age;
    private int personalNumber;
    private Loan[] loans = new Loan[2];


    public Customer(String name, String surname, int age, int personalNumber){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.personalNumber = personalNumber;
    }

    public void addLoans(Loan loan1, Loan loan2){
        loans[0] = loan1;
        loans[1] = loan2;

    }

    public int getSumOfLoans(){
        int sum=0;
        for (Loan loan: loans){
            sum+=loan.getAmount();
        }
        return sum;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", personalNUmber=" + personalNumber +
                ", loansSum=" + getSumOfLoans() +
                ", loan1=" + loans[0].getLoanInfo() +
                ", loan2=" + loans[1].getLoanInfo() +
                '}';
    }
}
