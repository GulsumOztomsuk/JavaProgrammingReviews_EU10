package Week05_08_10_2022;

import java.util.Scanner;

public class WithOutFirstAndLast {
    public static void main(String[] args) {
  /*
        Task 3: Given a string, return a version without the first and last char, so "Hello" yields "ell".
      Hint: The string length will be at least 2.
         */
        Scanner scan=new Scanner(System.in);
        String word=scan.next();
        String result="";
        if (word.length()<=2){
            result=word;
        }else {
            result=word.substring(1,word.length()-1);
        }
        System.out.println(result);

    }
}
