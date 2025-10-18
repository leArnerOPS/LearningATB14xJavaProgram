package ex_01_Java_Basics;

public class LAB030_interview_Concat {
    public static void main(String[] args) {

// +
        int a = 45;
        int b= 56;
        System.out.println(a+b);

//        String ==== concatenation
        String first_name= "Ashutosh";
        String last_name= "Dash";

        System.out.println(first_name+last_name);
        System.out.println(a+b+first_name+last_name);
        System.out.println(first_name+last_name+a+b);
        System.out.println(first_name+last_name+(a+b));



    }
}


// + behave differently with various datatypes
// + operator overloading
// only + supported not - / % *