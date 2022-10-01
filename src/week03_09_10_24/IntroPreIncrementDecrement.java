package week03_09_10_24;

public class IntroPreIncrementDecrement {
    public static void main(String[] args) {
        int a=5;
        System.out.println("a = " + a);
        System.out.println(++a); // a will be 6 print it
        System.out.println(a++);
        // but line 19 a will be 7
        System.out.println(a);

        int x=10;
        int number=x++ + 100;//number , number 110
        System.out.println("number = " + number);//x=11
        // int x=11; at backend and memory we have that value in x
        int number2=++x +100;//112
        System.out.println("number2 = " + number2);


    }
}
