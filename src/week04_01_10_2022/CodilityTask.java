package week04_01_10_2022;

public class CodilityTask {
    public static void main(String[] args) {

        // we will getone number from the user(create varible)
        int number=11;
        //we will create variable in order to put our result in it
       String result="";
        //we will check the number is pozitive or negative
       if (number>0) {
           //if the number is poztive we will check the number divisiable by 2 we will thw cidility inside veriable
           if (number % 2 == 0) {
               result = "codility";
           }
           //if the number is poztive we will check the number divisiable by 2 we will thw cidility inside veriable
           if (number % 3 == 0){
               // result=result + "test"
               result+="test";
           }
           if (number % 5 == 0){
               //result=result + "coder"
               result+="coder";
           }else{
                result =number + " is not divisiable 2 or 3 or 5";
           }
       }else {
           System.err.println("number is smaller than 0");
       }
        System.err.println(result);
    }
}
/*
Task 1:
        Write a function:
        that, given a positive integer N  However, any number divisible by 2, 3 or 5 shouldbe replaced by the word

        Codility -- 2
        Test     -- 3
        Coders   -- 5

        - If a number is divisible by more than one of the numbers:2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.

        EXPECTED

        numbers divisible by both 2 and 3 should be replacée by CodilityTest
        INPUT : 6    OUTPUT :  CodilityTest

        numbers divisible by allthree numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
        INPUT : 30    OUTPUT :  CodilityTestCoders

        27

        1

        1

        You do not have permission to send messages in this channel.

 */