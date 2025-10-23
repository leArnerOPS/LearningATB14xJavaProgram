package ex_01_Java_Basics;

import java.util.Scanner;

public class LAB057_Switch_statement {
    public static void main(String[]args) {

        // you need to take a user input and ask for the integer from 1 to 7
        // And if user enters 1 to 7
        // you will tell which day it  is

        // logic building formula

        // Step-1 Number one is using the scanner class
        // Step-2 number two will be basically figuring out the expression and the day
        // Step-3 we will basically add step 3 as a rough logic
        // Step-4 you will write the fix the logic and optimize
        // Step-5 figure out the edge cases

        // Step1
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the day to 1 to 7");
        if (scanner.hasNextInt()) {
            int day = scanner.nextInt();
            switch (day) {
                case 1:
                    System.out.println("MONDAY");
                    break;
                case 2:
                    System.out.println("TUESDAY");
                    break;
                case 3:
                    System.out.println("WEDNESDAY");
                    break;
                case 4:
                    System.out.println("THURSDAY");
                    break;
                case 5:
                    System.out.println("FRIDAY");
                    break;
                case 6:
                    System.out.println("SATURDAY");
                    break;
                case 7:
                    System.out.println("SUNDAY");
                    break;
                default:
                    System.out.println("Enter valid input");

            }
        }













    }
}
