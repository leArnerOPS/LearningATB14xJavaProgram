package ex_01_Java_Basics;

public class LAB098_example {
    public static void main(String[]args){

        String s="Java";
        char c = s.charAt(2);
        System.out.println(c);

        int result = "ABC".compareTo("ABC");
        System.out.println(result);

        int idx= "java".indexOf("j");
        System.out.println(idx);

        boolean b= "".isEmpty();
        System.out.println(b);

        String s44= String.join("-","java","python");
        System.out.println(s44);





    }
}
