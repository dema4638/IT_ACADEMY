package lt.itacademy.java.basics;

import java.util.Scanner;

public class Loops {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter days: ");
        int days = scan.nextInt();
        getHoursNdMInutes1(days);
        getHoursNdMInutes2(days);
        int number = scan.nextInt();
        getFactorial(number);
    }
    public static void  getHoursNdMInutes1(int days){
        int hours = 0, minutes = 0;
        for (int i=0; i<days; i++){
            hours+= 24;
            minutes+= 24*60;
        }

        System.out.println("There are "+ hours+" hours or " + minutes +" minutes in one year.");
    }

    public static void  getHoursNdMInutes2(int days){
        int hours = 0, minutes = 0;
        int i=0;
        while (i<days){
            hours+= 24;
            minutes+= 24*60;
            i++;
        }

        System.out.println("There are "+ hours+" hours or " + minutes +" minutes in one year.");
    }

    public static void  getFactorial(int number){
        int factorial=1;
        for (int i=number; i>0; i--){
          factorial *=i;
        }
        System.out.println(factorial);
    }
}
