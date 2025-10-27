package ex_01_Java_Basics;

import java.util.Random;
import java.util.Scanner;


public class LAB082_GUESSING_GAMe {
    public static void main (String[]args) {

        // guess a number between 1 and 100
        // n=50
        // 90 ,60 ,50 >>>>>> 50 to 60 yes
        Random random = new Random();
        int numbertoGuess = random.nextInt(101);
//        System.out.println(numbertoGuess);

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number");
        int guess;
        int attempts = 0;

        while (true){
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input ! Please enetr a number.");
                scanner.next();
                continue;
            }
            guess = scanner.nextInt();
            attempts++;

            if (guess <1 || guess >100){
                System.out.println("please eneter a number between 1 and 100");
                continue;
            }
            if (guess < numbertoGuess){
                System.out.println("Too low , try again");
            } else if (guess > numbertoGuess){
                System.out.println("Too high, Try again");
            }else {
                System.out.println("Correct! You guessed it in " + attempts + "attempts");
                break;
            }



        }















    }
}
