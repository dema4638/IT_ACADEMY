package com.itacademy.java.oop.basics;

public class ShapeApplication {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square(10, 7);
        squares[1] = new Square(30, 10);
        squares[2] = new Square(30, 5);
        for(Square square : squares){
            if (square.getWidth()<0||square.getLength()<0){
                System.out.println("The parameters for square are nor correct: width "+square.getWidth() + " height: "+ square.getLength());
            }
            else{
                System.out.println(square.toString());
            }
        }
    }
}
