package com.itacademy.java.oop.basics;

public class Family {
    private Person[] arrayOfPeople;
    private Vehicle vehicle;
    private TravelDestination travelDestination;

    public Family(Person[] arrayOfPeople, Vehicle vehicle, TravelDestination travelDestination) {
        this.arrayOfPeople = arrayOfPeople;
        this.vehicle = vehicle;
        this.travelDestination = travelDestination;
    }

    public Person[] getArrayOfPeople() {
        return arrayOfPeople;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public TravelDestination getTravelDestination() {
        return travelDestination;
    }

    public void setTravelDestination(TravelDestination travelDestination) {
        this.travelDestination=travelDestination;
    }

    public int calcAvailableDistance(Vehicle vehicle){
        return vehicle.calcAvailableDistance();
    }

    public void printFamilyMembers(){
        for (Person person : this.arrayOfPeople){
            System.out.println(person.toString());
        }
    }
}
