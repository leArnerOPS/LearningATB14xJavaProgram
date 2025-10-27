package ex_01_Java_Basics;

public class LAB087_functions {
    public static void main (String[]args){
       String name= return_type_function();
        System.out.println(name);
        non_return_types_functions();

    }
    static void non_return_types_functions(){
        System.out.println("hi there, no return function");

    }
    static String return_type_function(){
        System.out.println("it will return something");
        return "Ashu";
    }
}
