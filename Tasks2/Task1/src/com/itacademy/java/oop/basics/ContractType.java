package com.itacademy.java.oop.basics;

public enum ContractType {
    FULL_TIME("Full-Time"), PART_TIME("Part-Time");

    private String displayValue;

    public String getDisplayValue(){
        return displayValue;
    }

    ContractType(String displayValue){
        this.displayValue = displayValue;
    }
}
