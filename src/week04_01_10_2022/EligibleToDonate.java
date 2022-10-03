package week04_01_10_2022;

import java.util.Scanner;

public class EligibleToDonate {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your age");

        int age= input.nextInt();
        System.out.println("please enter your weight");
        double weight= input.nextDouble();

        if (age>=18){
            if (weight>=50){
                System.out.println("you are eligible to donate blood");
            }
        }else {
            System.out.println("you are not eligible to donate blood");
            System.out.println("age must be greater than 18");

        }

    }
}
