package week06_15_10_2022;

public class T2_CountWord {
    public static void main(String[] args) {
        String word="Java is java in everywhere Java";// if we count the spaces and adding +1 wecan get the words
       int counter=0;
        for (int i = 0; i < word.length() ; i++) {
            if (word.charAt(i)!=' ')
                counter++;
        }
        System.out.println(counter+1);
    }
}
/*
    Task 2: Given a sentence which is string and count the words in it.

input:

  String str="Java is java in everywhere is Java";

  output:7

 */