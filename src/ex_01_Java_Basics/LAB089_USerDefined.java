package ex_01_Java_Basics;

        class LAB090_questions {
            public static void main(String[]args) {
                //------user-defined functions.....
                // without parameters and without return types
                //without parameters and with return types
                // with parameters and without return types- main
                // with parameters and with return types-

                wop_wor_greet();

                String msg= wop_wr_grret2();
                System.out.println(msg);

                greet_with_details("Ashutosh", 25,0000000);
                greet_with_details("Ankit", 25, 0000);


                int sum= sum_of_two_numbers(3,4);
            }


            // without parameters and without return types

            static void wop_wor_greet(){
                System.out.println("hi there");


            }
            // without parameters and with return types

            static String wop_wr_grret2(){
                return "hi, how are you?";
            }

            //with parameters and without return types

            static void greet_with_details( String name ,int ageof, double salary){
                System.out.println("your name is->" +name +" your age is" + ageof + "your salary" + salary);
            }

            //    with parameters and with return types
            static int sum_of_two_numbers(int a, int b){
                return a+b;
            }
        }


