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
 /*
        Task 2: Create a logic print a new string made of 3 copies of the last 2 chars of the original string.
input:Hello
output:lololo
      Hint: The string length will be at least 2.
         */