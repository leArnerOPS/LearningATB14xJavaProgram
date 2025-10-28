package ex_01_Java_Basics;

public class LAB095_SSString {

    public static void main(String[]args){
        String s1 = "hello";
        String s6= "hello";

        String s2= new String("h");
        String s4= new String("i");
        String s5= new String("j");

        System.out.println(s2==s4);
        System.out.println(s4==s5);
        System.out.println (s2==s5);
        System.out.println(s1==s6);

// equals (content) ----value
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s6));



    }
}
