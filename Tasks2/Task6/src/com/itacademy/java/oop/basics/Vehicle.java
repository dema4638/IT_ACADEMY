package com.itacademy.java.oop.basics;

public class Vehicle {
    private String name;
    private String brand;
    private int fuel;
    private int consumption;

    public Vehicle(String name, String brand, int fuel, int consumption) {
        this.name = name;
        this.brand = brand;
        this.fuel = fuel;
        this.consumption = consumption;
    }

    public int calcAvailableDistance(){
        return (this.fuel*100)/this.consumption;
    }

    public int calcFuelNeeded(int distance){
        return (distance * consumption)/100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

}
