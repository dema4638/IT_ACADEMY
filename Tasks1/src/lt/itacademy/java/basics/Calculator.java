package lt.itacademy.java.basics;

import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Please, enter data:");
            String shape = scan.next();
            int x=0,y=0,z=0;
            switch(shape){
                case "Rectangle":
                    x = scan.nextInt();
                    y = scan.nextInt();
                    if (x<=0 || y<=0){
                        System.out.println("The values are not correct");
                    }else {
                        calcRectangle(x, y);
                    }
                    break;
                case "Triangle":
                    x = scan.nextInt();
                    y = scan.nextInt();
                    z= scan.nextInt();
                    if (x<=0 || y<=0 || z<=0){
                        System.out.println("The values are not correct");
                    }else {
                        calcTriangle(x, y, z);
                    }
                    break;
                case "Square":
                    x = scan.nextInt();
                    if (x<=0){
                        System.out.println("The values are not correct");
                    }else {
                        calcSquare(x);
                    }
                    break;
            }

        }
    }
    public static void calcRectangle(int x, int y) {
        int perimeter;
        int area;
        perimeter =x*2+y*2;
        area = x*y;
        System.out.println("Rectangle " +  "perimeter is " + perimeter + " and area is " + area);
    }

    public static void calcSquare(int x) {
        int perimeter;
        int area;
        perimeter = 4*x;
        area = x*x;
        System.out.println("Square " +  "perimeter is " + perimeter + " and area is " + area);
    }

    public static void calcTriangle(int x, int y, int z) {
        int perimeter;
        double area;
        perimeter = x+y+z;
        area = 0.25 * Math.sqrt(x+y+z) * Math.sqrt(-x+y+z) * Math.sqrt(x-y+z) * Math.sqrt(x+y-z);
        System.out.println("Triangle " +  "perimeter is " + perimeter + " and area is " + area);
    }

}

