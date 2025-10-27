package ex_01_Java_Basics;

import java.util.Scanner;

public class LAB075_interview_FACTORIAL {
    public static void main(String[]args){

        // calculate the factorial
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        int fact = 1;
        if (n==0){
            fact =1;
        }
        for (int i = 1; i <= n; i++) {
            fact = fact*i;

        }
        System.out.println(fact);
        }






    }


