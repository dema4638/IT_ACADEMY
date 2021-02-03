package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x: " );
        int x = scan.nextInt();
        int volume = x*x*x;
        int perimeter = x*6;
        System.out.println("Cube’s volume: " + volume);
        System.out.println("Cube’s perimeter: " + perimeter);
        //5:
        System.out.println("Enter feet: " );
        double feet = scan.nextDouble();
        System.out.println("Enter inches: " );
        double inches = scan.nextDouble();
        System.out.println(feet + " feet and " + inches + " inches = " + convertToCentimeters(feet,inches)+ " cm");


    }

    private static double convertToCentimeters(double feet, double inches){
        double feet2 = feet% 1;
        double feet1 = feet - feet2;
        feet2 = feet2*12;
        return (feet1*12*2.54) + (inches * 2.54) + (feet2* 2.54);
    }
}

