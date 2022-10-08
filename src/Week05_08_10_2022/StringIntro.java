package Week05_08_10_2022;

import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        //we can creat String two different ways
        //1. String literal
        String str="Kazim";
        String str1="Kazim";
        System.out.println(str==str1);

        //2. newkeyword

        String str2=new String("Kazim");
        String str3=new String("Kazim");

        System.out.println(str1==str2);
        System.out.println(str2==str3);
    }
}
