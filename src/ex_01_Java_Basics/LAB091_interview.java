package ex_01_Java_Basics;

import java.util.Scanner; // Error 1: Import the Scanner class

public class LAB091_interview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = readInt(scanner, "Enter the num1:");
        int b = readInt(scanner, "Enter the num2:");

        int result_sum = sum(a, b);
        int result_sub = sub(a, b);
        int result_mul = mul(a, b);
        int result_div = div(a, b);
        int result_mod = mod(a, b);

        System.out.println("Sum: " + result_sum);
        System.out.println("Subtraction: " + result_sub);
        System.out.println("Multiplication: " + result_mul);
        System.out.println("Division: " + result_div);
        System.out.println("Modulus: " + result_mod);

        scanner.close(); // Good practice to close the scanner
    }

    static int readInt(Scanner scanner, String prompt) {
        System.out.println(prompt);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Error: Please enter an integer value only.");
            System.exit(0); // Exits the program if input is not an integer
            return 0; // This line is technically unreachable but required by the compiler
        }
    }

    // Error 2: All methods below were moved inside the class
    static int sum(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        // Added a check to prevent division by zero
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            System.exit(0);
        }
        return a / b;
    }

    static int mod(int a, int b) {
        // Added a check to prevent division by zero for modulus
        if (b == 0) {
            System.out.println("Error: Cannot perform modulus with zero.");
            System.exit(0);
        }
        return a % b;
    }
}
