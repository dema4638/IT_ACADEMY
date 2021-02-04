package com.itacademy.java.oop.basics;

public enum VehicleBrand {
    TOYOTA("Toyota"), AUDI("Audi"), BMW("BMW"), RENAULT("Renault");

    private String displayValue;
    public String getDisplayValue(){
        return displayValue;
    }
    VehicleBrand(String displayValue){
        this.displayValue = displayValue;
    }
}
