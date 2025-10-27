package ex_01_Java_Basics;

import java.util.Scanner;

public class LAB088_functions_USER_DEFINED {
    public static void main(String[]args){


        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a");
        int a = scanner.nextInt();
        System.out.println("Enter b");
        int b= scanner.nextInt();

        int result = sum_of_two_numbers(a,b);

        int result1 = sum_of_two_numbers(10,50);
        System.out.println(result);
        System.out.println(result1);
    }
    static int sum_of_two_numbers(int a, int b){
        return a+b;

    }
}
