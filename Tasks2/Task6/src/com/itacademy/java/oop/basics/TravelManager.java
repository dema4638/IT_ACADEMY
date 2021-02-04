package com.itacademy.java.oop.basics;

public final class TravelManager {

    public static Family changeDestination(Family family, TravelDestination destination){
        if (!destination.getName().equals(family.getTravelDestination().getName())) {
            family.setTravelDestination(destination);
        }
        return family;
    }

    public static void travel(Family family){
        int availableDistance = family.getVehicle().calcAvailableDistance();
        int distance = family.getTravelDestination().getDistance();
        if (availableDistance >= distance){
            System.out.println("The family is able to travel to the destination");
        }  else{
            System.out.println("The family is not able to travel to the destination. The car should have "
                    + family.getVehicle().calcFuelNeeded(distance) + " leters of fuel.");
        }
    }

    public static void printFamilyMembers(Family family){
       family.printFamilyMembers();
    }
}
