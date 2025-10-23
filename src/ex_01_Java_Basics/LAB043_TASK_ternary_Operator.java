package ex_01_Java_Basics;

public class LAB043_TASK_ternary_Operator {
    public static void main(String[]args) {



//        check if the number is even or odd using Terrnary operator
        int a= 21;
        String result= (a % 2 == 0) ? "even" : "odd";
        System.out.println(result);


//        max between 3 numbers .>> int n1=2; int n2=9; int n3=-11;

        int n1= 2;
        int n2= 9;
        int n3= -11;
        String result_max= (n1 > n2) ? (n1 > n3) ? "n1" : "n3" : (n2 > n3) ? "n2" : "n3";
        System.out.println( result_max );




//        Real_Age_Classification (age -59) - minor, adult (Adult, Sr Senior) - Ternary operator

        int Ashutosh_age= 25;
        String age_classification= Ashutosh_age > 20 ? (Ashutosh_age> 60 ? "Senior" : "Adult") : (Ashutosh_age <20? "kids" : "adult");
        System.out.println(age_classification);


    }
}
