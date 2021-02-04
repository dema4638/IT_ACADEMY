package com.itacademy.java.oop.basics;

public class EmployeeManager {
    public static void main(String[] args) {
        String contractType = ContractType.FULL_TIME.getDisplayValue();
        Employee employee = new Employee("Vardas", "Pavarde", contractType, "2020-02-01", 1000, "developer");
        System.out.println(employee);
    }
}
