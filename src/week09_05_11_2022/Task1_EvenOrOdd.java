package week09_05_11_2022;

public class Task1_EvenOrOdd {
    public static void main(String[] args) {
        evenOrOdd(8);
    }

    public static void evenOrOdd(int number){
       if (number%2==0){
           System.out.println(number+"is even");
       }else{
           System.out.println(number +"is odd");
       }

    }
}
/*Task 1 :   Write a method that can check if a number is even or odd

 */