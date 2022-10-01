package week_02_16_10_2022;

public class BasicCalculator {
    public static void main(String[] args) {

      /*  3. Create a class named BasicCalculator. write a Java program
      to print the sum (addition), multiply, subtract,
       divide and remainder of two numbers.
       */
        int firstNumber,num2;
        firstNumber =20;
        num2=5;

        int sum= firstNumber + num2;
        int subtract= firstNumber - num2;
        int multiply= firstNumber *num2;
        int devide= firstNumber /num2;
        int reminder= firstNumber %num2;

        System.out.println("sum=" +sum);
        System.out.println("subtract=" +subtract);
        System.out.println("multiply=" +multiply);
        System.out.println("devide=" +devide);
        System.out.println("reminder=" +reminder);


    }
}
