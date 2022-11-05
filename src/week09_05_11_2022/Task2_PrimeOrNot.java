package week09_05_11_2022;

public class Task2_PrimeOrNot {
    public static void main(String[] args) {
  boolean result=isPrime(7);//true
        }

    public static boolean isPrime(int number){
        boolean isPrime=true;
        if (number<2){
            return false;

        }
        for (int i = 2; i < number ; i++) {
            if (number%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
}
/*Task 2 :   Write a method that can check if a number is prime or not

        Note : Prime numbers are special numbers, greater than 1, that have exactly two factors, themselves and 1

        7
        is divisible by 2
        is divisible by 3
        is divisible by 4
        is divisible by 5
        is divisible by 6


 */
