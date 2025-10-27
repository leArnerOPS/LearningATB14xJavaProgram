package ex_01_Java_Basics;

public class LAB070_LOOP_FOR_IFELSE {
    public static void main(String[] args) {
        // to find  the even number from 1 to 50
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even ->" + i);
            }
        }

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 1) {
                System.out.println("ODD->" + i);


            }
        }
    }
}
