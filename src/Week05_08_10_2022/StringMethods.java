package Week05_08_10_2022;

public class StringMethods {
    public static void main(String[] args) {
        //i we want to get specificchar.charAt()
        //0123
        String str="Adam";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(3));
        //if we wnat to get the lenght of String lenght
        System.out.println(str.length());
        //get the last character
        int lengthOfTheString=str.length();
        int indexOfLastChar=lengthOfTheString-1;
        System.out.println(str.charAt(indexOfLastChar));

        //      in order to makeletter to lower case toLowerCase
        System.out.println(str.toLowerCase());
        //in order to makeletter to upper case toUpperCase
        System.out.println(str.toUpperCase());

        //
        String str1="    Adam     ";
        System.out.println(str1.trim());
        System.out.println(str1);//we wil have spacein here because String class is immutable

        //if you want toget index of char or string we need to ise indexOf() method
        //index 0123456
        String number="0123456";
        System.out.println( number.indexOf('3'));//index of 3 is three
        System.out.println(number.indexOf("14"));// it will return -1 means there is no 14 in that String
        System.out.println(number.indexOf("56"));//get the index 56

        String sentence="Java is a programming language";
        System.out.println(sentence.indexOf("programming"));

        String sentence1="Java is Java";
        System.out.println(sentence1.indexOf("Java"));
        System.out.println(sentence.indexOf(" Java"));
        System.out.println(sentence1.lastIndexOf("Java"));// return me 8
        //if we want to replace some oart of the string we need to use replace() or replaceFirst()
        String sentence3="Java is a hard programming language ";
        System.out.println(sentence3.replace("hard", "easy"));
         String sentence4="Java is not same with java";
        System.out.println(sentence4.replaceFirst("java","C#"));

    }
}
