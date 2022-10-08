package Week05_08_10_2022;

import java.util.Scanner;

public class ThreeCopyOfLastTwoChar {
    public static void main(String[] args) {
       //Scanner scan=new Scanner(System.in);
        //System.out.println("enter a word");
        String  word="Hello";
        int indexOfLastChar=word.length()-1;
        int indexOfSecondFromLast=word.length()-2;
        char last=word.charAt(indexOfLastChar);
        char beforeLast=word.charAt(indexOfSecondFromLast);
        String lastTwo=""+ beforeLast +last;
        System.out.println(lastTwo+lastTwo+lastTwo);
    }
}
