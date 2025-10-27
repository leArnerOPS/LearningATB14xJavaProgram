package ex_01_Java_Basics;

import java.util.Scanner;

public class LAB081_interview {
    public static void main(String[] args) {

        // factorial

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for factorial program!");
        if (!scanner.hasNext()) {
            System.out.println("You fool, int only");
        } else {
            int number = scanner.nextInt();
            int fact = 1;
            if (number == 0) {
                fact = 1;
                System.out.println("fact =1");
            }
            int i = 1;
            while (i <= number) {
                fact = fact * i;
                i++;
            }
            System.out.println(fact);
        }
    }
}
