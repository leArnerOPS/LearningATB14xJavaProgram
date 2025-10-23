package ex_01_Java_Basics;

import java.util.Scanner;

public class LAB058_without_break {
    public static void main(String[]args) {



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

                case 3:
                    System.out.println("WEDNESDAY");

                case 4:
                    System.out.println("THURSDAY");

                case 5:
                    System.out.println("FRIDAY");

                case 6:
                    System.out.println("SATURDAY");

                case 7:
                    System.out.println("SUNDAY");

                default:
                    System.out.println("Enter valid input");

            }
        }

    }
}
