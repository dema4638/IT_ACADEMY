package com.itacademy.java.oop.basics;

public enum LoanType {
    LEASING("leasing"), CONSUMER("consumer");

    private String displayValue;

    public String getDisplayValue(){
        return displayValue;
    }

    LoanType(String displayValue){
        this.displayValue = displayValue;
    }
}
