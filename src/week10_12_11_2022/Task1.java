package week10_12_11_2022;

public class Task1 {
    public static void main(String[] args) {
        String str="(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
        String sentence="";

        for (char each: str.toCharArray()){
            if (Character.isUpperCase(each)){
                sentence +=' ';
            }
          if (Character.isLetter(each)){
          sentence +=String.valueOf(each);
               }
        }
        System.out.println("sentence = " + sentence);

    }
}
/*Task 1 : Find the word

        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";

        Write a method that returns : Welcome To Core Java */