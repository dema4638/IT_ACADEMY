package lt.itacademy.java.basics;

import java.util.Scanner;


public class Basics {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter your: name surname age:");
        String name = scan.next();
        String surname = scan.next();
        String age = scan.next();
        System.out.println("Helllo I am " +  name + " " + surname + ". I am attending IT academy 2021!");

        int x = 10;
        boolean isTrue = true;
        char ch = 'H';
        float fl =  2.0f;
        byte by = 3;
        short sh = 1;
        String word = "w0r1d";
        String ch1 = String.valueOf(ch);

        System.out.println(ch1 + by + sh + x + " " + word + " " + fl + " " + isTrue);
        System.out.println("Write first number: ");
        int num1 = scan.nextInt();
        System.out.println("Write second number: ");
        int num2 = scan.nextInt();
        arithmetics(num1,num2);

    }

    private static void arithmetics(int num1, int num2){
        System.out.println("The sum is: " + (num1+num2));
        System.out.println("The difference is: " + (num1-num2));
        System.out.println("The product is: " + (num1*num2));
        System.out.println("The multiple is: " + (num1/num2));
        System.out.println("The distance is: " + (Math.abs(num1)-Math.abs(num2)));
        System.out.println("The distance is: " + (Math.abs(num1)-Math.abs(num2)));
        int max, min;
        if (num1 >= num2){
            max = num1;
            min = num2;
        }else{
            max = num2;
            min = num1;
        }
        System.out.println("The maximum is: " + max);
        System.out.println("The minimum is: " + min);
        }
}
