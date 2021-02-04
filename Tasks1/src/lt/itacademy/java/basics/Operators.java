package lt.itacademy.java.basics;

import java.util.Scanner;

public class Operators {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();
        System.out.println(checkIfEquilater(x, y, z));
        double distance = scan.nextDouble();
        double fuelInTank = scan.nextDouble();
        double fuelUsage = scan.nextDouble();
        double price = scan.nextDouble();
        checkIfCarCanGo(distance,fuelInTank,fuelUsage, price);
    }

    public static String checkIfEquilater(double x, double y, double z) {


        if (x == y && x == z) {
            return ("Triangle is Equilateral. Sides: " + x + " " + y + " " + z);
        } else if (x == y || x == z || y == z) {
            return ("Triangle is Isosceles. Sides: " + x + " " + y + " " + z);
        }
        return ("Triangle is Scalene. Sides: " + x + " " + y + " " + z);
    }

    public static void checkIfCarCanGo(double distance, double fuelInTank, double fuelUsage, double price) {
        double x = (distance / 100) * fuelUsage;
        boolean isEnoughFuel = false;
        if (fuelInTank >= x) {
            isEnoughFuel = true;
        }

        if (!isEnoughFuel) {
            double fuelNeeded = x - fuelInTank;
            double moneyNeeded = fuelNeeded * price;
            System.out.println("Destination is in " + distance + ". Car is not able to reach the destination. It needs " + fuelNeeded + " liter of fuel more. It will cost " + moneyNeeded);
        } else {
            System.out.println("Destination is in " + distance + ". Car is able to reach the destination. It needs " + (fuelInTank- x) + " liter of fuel will be left");
        }
    }
}
