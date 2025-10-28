package ex_01_Java_Basics;

public class LAB097_StringSUB {
    public static void main(String[]args){
        String s= "JAVA".substring(2);
        System.out.println(s);

        String s3="java".substring(1,2);
        System.out.println(s3);

        char[] arr= "Java".toCharArray();
        System.out.println(arr);

        String s5= "JAva".trim();
        System.out.println(s5);

        String s4="ashut".repeat(9);
        System.out.println(s4);

        boolean b11= "java".equalsIgnoreCase("JJava");
        System.out.println(b11);

        long count="a\nb\nc".lines().count();
        System.out.println(count);


    }
}
