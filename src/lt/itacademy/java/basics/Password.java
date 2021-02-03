package lt.itacademy.java.basics;

import java.util.Scanner;

public class Password {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter your password: ");
        String password = scan.next();
        System.out.println(checkIfPasswordValid(password));

        System.out.println("Enter n and substring: ");
        long n = scan.nextLong();
        String substring = scan.next();
        System.out.println(findLettersCount(n, substring));

        System.out.println("Enter two positive numbers: ");
        String x = scan.next();
        String y = scan.next();
        int sum = addNumbers(x,y);
        if (sum<0){
            System.out.println("Numbers are not correct.");
        } else{
            System.out.println("The sum of these numbers is: " + sum);
        }
    }

    //Optional 1:
    private static String checkIfPasswordValid(String password) {
        int digitsCount = 0;
        if (password.length() >= 10) {
            for (int i = 0; i < password.length(); i++) {
                int asciiValue = (int) password.charAt(i);
                if (asciiValue >= 48 && asciiValue <= 57) {
                    digitsCount++;
                } else if (asciiValue < 65 || asciiValue > 122) {
                    return "Password is not valid: " + password;
                }
            }
            if (digitsCount >= 2) {
                return "Password is valid: " + password;
            }
        } else {
            return "Password is not valid: " + password;
        }
        return "Password is not valid: " + password;
    }

    //Optional 2:
    private static long findLettersCount(long n, String substring) {
        int countOfA = 0;
        int countOfAPart = 0;
        long finalCountOfA = 0;
        for (int i = 0; i < substring.length(); i++) {
            if (substring.charAt(i) == 'a') {
                countOfA++;
                if (i < n % substring.length()) {
                    countOfAPart++;
                }
            }
        }
        if (countOfA > 0) {
            finalCountOfA = (n / substring.length()) * countOfA + countOfAPart;
        }
        return finalCountOfA;
    }

    //Optional 3:
    private static int addNumbers(String x, String y) {
        int num1, num2;
        try {
            num1 = Integer.parseInt(x);
            num2 = Integer.parseInt(y);
        }
        catch(NumberFormatException e){
            return -1;
        }
        if (num1<0 || num2 <0){
            return -2;
        }
        return num1+num2;
        }

}