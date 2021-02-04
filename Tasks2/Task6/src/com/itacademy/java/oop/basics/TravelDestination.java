package com.itacademy.java.oop.basics;

public class TravelDestination {
    private String name;
    private String city;
    private int distance;

    public TravelDestination(String name, String city, int distance) {
        this.name = name;
        this.city = city;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getDistance() {
        return distance;
    }
}
