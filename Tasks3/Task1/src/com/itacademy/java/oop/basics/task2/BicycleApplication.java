package com.itacademy.java.oop.basics.task2;

import com.itacademy.java.oop.basics.task2.exceptions.NotLegalObjectInitializationValues;

public class BicycleApplication {

    public static void main(String[] args) {

        try {
            RoadBike roadBike = new RoadBike(10, 30);
            roadBike.changeGear(11);
            roadBike.changeGear(5);
            System.out.println(roadBike.getGear());
            roadBike.changeGear(8);
            System.out.println(roadBike.getGear());

            roadBike.applyBrakes(10);
            roadBike.speedUp(10);

            MountainBike mountainBike = new MountainBike(20, 100);
            mountainBike.applyBrakes(15);
            mountainBike.speedUp(200);

            System.out.println(roadBike.getSpeed());
            roadBike.speedUp(50);
            roadBike.speedUp(-50);

            System.out.println(mountainBike.getSpeed());
            System.out.println(roadBike.getSpeed());
            System.out.println(Speedometer.chooseWinner(mountainBike, roadBike));

        }catch (NotLegalObjectInitializationValues e){
            e.printStackTrace();
        }
    }
}
