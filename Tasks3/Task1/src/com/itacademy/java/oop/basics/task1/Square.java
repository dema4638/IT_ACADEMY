package com.itacademy.java.oop.basics.task1;

public class Square extends Shape{

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side,2);
    }

    @Override
    public double calculatePerimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return String.format("Square[side= %s, area= %s, perimeter= %s]", side, calculateArea(), calculatePerimeter());
    }
}
