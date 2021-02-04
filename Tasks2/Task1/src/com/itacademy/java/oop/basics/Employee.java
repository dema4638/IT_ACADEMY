package com.itacademy.java.oop.basics;

import java.util.Date;

public class Employee {
    private String name;
    private String surname;
    private String contractType;
    private String contractStartDate;
    private int salary;
    private String position;

    public Employee(){}

    public Employee(String name, String surname, String contractType, String ccontractStartDate, int salary, String position){
        this.name = name;
        this.surname = surname;
        this.contractType = contractType;
        this.contractStartDate = contractStartDate;
        this.salary = salary;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", contractType=" + contractType +
                ", contractStartDate=" + contractStartDate +
                ", contractType=" + salary +
                ", position=" + position +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getContractType() {
        return contractType;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }
}
