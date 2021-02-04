package com.itacademy.java.oop.basics;

public class PointApplication {
    public static void main(String[] args) {


        MyPoint point1 = new MyPoint(10, 20);
        MyPoint point2 = new MyPoint(30, -5);

        System.out.println("Coordinates of the first point are: ");
        int[] coordinates1 = point1.getXY();
        for(int coordinate : coordinates1){
            System.out.println(coordinate);
        }

        System.out.println("Coordinates of the second point are: ");
        int[] coordinates2 = point2.getXY();
        System.out.println(coordinates2[0]);
        System.out.println(coordinates2[1]);

        System.out.println("The distance between point "+ point1.toString() + " and" + point2.toString() + " is " + point1.distance(point2));
        point1.setX(0);
        point1.setY(5);
        System.out.println("The distance between point "+ point1.toString() + " and" + " (0,0) is " + point1.distance());
        point1.setXY(10,10);
        System.out.println("The distance between point "+ point1.toString() + " and" + " (20,30) is " + point1.distance(20,30));

    }
}
