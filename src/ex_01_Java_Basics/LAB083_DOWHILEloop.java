package ex_01_Java_Basics;

public class LAB083_DOWHILEloop {
    public static void main(String[]args) {
        // do while loop
        // Initialization >>> body(1 time) >>> Condition >>> updation () increment/decrement

        int a =1;
        do {
            System.out.println("body!");
            System.out.println(a);
            a++;
        }while (a <10);
    }
}
