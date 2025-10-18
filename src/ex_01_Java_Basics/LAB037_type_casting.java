package ex_01_Java_Basics;

public class LAB037_type_casting {
    public static void main(String[] args) {
//
        byte b= 10;
        int a = b;

//       not possible because of size matters
        int a1=300;
        byte b1= (byte)a1;

//        long_short
        long phone_no= 9393939300l;
//        short s= phone_no; // narrowing -implicity
        short s= (short)phone_no;
        System.out.println(s);



    }
}
