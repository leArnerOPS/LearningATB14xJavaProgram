package ex_01_Java_Basics;

public class LAB033_ORANDGATE {
    public static void main(String []args){

//        System.out.println(true || false);

        int balaji_salary = 12;
        boolean b = !(balaji_salary >10 || balaji_salary < 5);
        System.out.println(b);

//divide and conquer!

//        A - balaji_salary > 10 -> 12 > 10 -> true
//        B - balaji_salary > 5 -> 12 <5  -> false
//        (A || B) -> True
//         !(true) -> False





    }
}
