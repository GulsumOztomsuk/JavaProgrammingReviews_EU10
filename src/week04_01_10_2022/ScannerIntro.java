package week04_01_10_2022;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter one integer number");
        int intValue=scanner.nextInt();
        System.out.println("intValue = " + intValue);

        System.out.println("please enter one double number");
        double doubleValue=scanner.nextDouble();
        System.out.println("doubleValue = " + doubleValue);

    }
}

