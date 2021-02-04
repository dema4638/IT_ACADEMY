package com.itacademy.java.oop.basics;

public class TravelApplication {
    public static void main(String[] args) {
        Person[] people1 = new Person[2];
        people1[0] = new Person("Vardas1", "Pavarde1", "Moteris", 20);
        people1[1] = new Person("Vardas2", "Pavarde2", "Vyras", 30);
        Vehicle vehicle1 = new Vehicle("car", VehicleBrand.AUDI.getDisplayValue(), 5, 4);
        TravelDestination travelDestination1 = new TravelDestination("123", "Vilnius", 200);
        Family family1 = new Family(people1, vehicle1, travelDestination1);
        TravelManager.travel(family1);

        Person[] people2 = new Person[3];
        people2[0] = new Person("Vardas3", "Pavarde3", "Moteris", 20);
        people2[1] = new Person("Vardas4", "Pavarde4", "Vyras", 30);
        people2[2] = new Person("Vardas5", "Pavarde5", "Vyras", 30);
        Vehicle vehicle2 = new Vehicle("car", VehicleBrand.AUDI.getDisplayValue(), 10, 5);
        TravelDestination travelDestination2 = new TravelDestination("123", "Vilnius", 100);
        Family family2 = new Family(people2, vehicle2, travelDestination2);
        TravelManager.travel(family2);

        TravelDestination travelDestination3 = new TravelDestination("000", "Kaunas", 1000);
        TravelManager.changeDestination(family2, travelDestination3);
        TravelManager.travel(family2);

        System.out.println("Members of the second family are: ");
        TravelManager.printFamilyMembers(family2);

    }
}
