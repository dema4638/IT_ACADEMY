package com.itacademy.java.oop.basics;

public class Square {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public Square(int width, int length){
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        return this.width * this.length;
    }

    public double getPerimeter(){
        return (this.width * 2) + (2* this.length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length='" + length + '\'' +
                ", width='" + width + '\'' +
                ", perimeter='" + getPerimeter() + '\'' +
                ", area='" + getArea() + '\'' +
                '}';
    }
}
