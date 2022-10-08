package Week05_08_10_2022;

import java.util.Scanner;

public class GetFirstToUpperCase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //string word="Hello"
        String word=scanner.next();
        String result=""+word.charAt(0)+word.charAt(1);
        String result2=word.charAt(0)+""+ word.charAt(1);

        System.out.println(result.toUpperCase());
        System.out.println(result2.toUpperCase());
    }
}
