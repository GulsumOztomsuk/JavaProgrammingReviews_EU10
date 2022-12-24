package week16_24_12_2022.Exceptions;

import week15_17_12_2022.Method_Overrading.Task3.Employee;

import java.util.SortedMap;

public class RunTimeExceptionsExamples {

    static Employee employee; //we need to make it static in oreder to use inside main method which is static

    public static void main(String[] args) {
//ArithmeticException
        try {
            for (int i = 5; i >= 1; i--) {   //ctrl + alt + T
                System.out.println(60 / i);  //java.lang.ArithmeticException
            }
        } catch (Exception e) {
            e.getMessage(); //simple message
           // e.printStackTrace(); //detailed message

        }
//NullPointerException
//You can not reach instance variables or methods from the static block or method
        //java.lang.NullPointerException if you want to reach object fields or methods you have  to initialize it. I
        // mean creating object
        //  System.out.println(employee.salary());

        //NumberFormatException
        try {
            String str="Adam 123.";
            String s=str.substring(str.indexOf(" ")+1);
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            e.getMessage();

        }

        //ArrayIndexOutOfBoundsException

        try {
            int[] array={1,2,3};

            System.out.println(array[3]); //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        } catch (Exception e) {
            e.getMessage();
        }

        //StringIndexOutOfBoundsException
        try {
            String name="Adam";

            System.out.println(name.charAt(4)); //java.lang.StringIndexOutOfBoundsException: String index out of range: 4
        } catch (Exception e) {
            e.getMessage();
        }

    }
}
