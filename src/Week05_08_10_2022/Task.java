package Week05_08_10_2022;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a sentence or word:");
        String str = scan.nextLine();

        System.out.println(str.substring(0,2).toUpperCase());

        scan.close();

    }

}
/*
    Given a string, print the string made of its first two chars, so the String "Hello" yields “HE".
     */