package week04_01_10_2022;

public class CharecterType {
    public static void main(String[] args) {
        char ch='A';
        boolean IsUpperCase= ch>='A' && ch<='Z';
        boolean IsLowerCase= ch>= 'a' && ch<='z';
        boolean IsNotAlphabetic=//!(IsUpperCase || IsLowerCase);
                                !IsUpperCase&&!IsLowerCase;
        if (IsUpperCase){
            System.out.println(ch + " is an uppercase character");
        } else if (IsLowerCase) {
            System.out.println(ch + " is an lower case character");
        }else {
            System.out.println(" is not an alphabetic character");

        }
    }
}
