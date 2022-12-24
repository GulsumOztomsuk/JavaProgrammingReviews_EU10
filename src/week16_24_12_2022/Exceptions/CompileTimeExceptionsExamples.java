package week16_24_12_2022.Exceptions;

public class CompileTimeExceptionsExamples {
    public static void main(String[] args) {
        System.out.println("Adam");
        waitFor(3);
        System.out.println("Gülüş");
        //Thread.sleep(3000);
    }
   private static void waitFor(int seconds){
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }
   }
}
