package ex_01_Java_Basics;

public class LAB008_println_vs_print {
    public static void main(String[] args) {
//    println___execute new line with output
//        print__ only print the result

int a = 10;
int b= 20;
        System.out.println(a);
        System.out.println(b);

        System.out.print(a);
        System.out.println();

        System.out.print(b);
        System.out.println();

        System.out.printf("Value of a is %d", a);
        System.out.println();
        System.out.printf("Value of b is %d", b);
    }
}
