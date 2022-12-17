package week15_17_12_2022.Method_Overrading.Task1;

public class TestInterest {
    public static void main(String[] args) {

        Bank bank=new Bank();
        bank.calculateTheInterest();

        System.out.println("-----------------");

        AkBank akbank=new AkBank();
        akbank.calculateTheInterest();

        System.out.println("---------------------");

        GarantiBank garantiBank=new GarantiBank();
        garantiBank.calculateTheInterest();

        System.out.println("-----------------");

        INGBank ingBank=new INGBank();
        ingBank.calculateTheInterest();
    }
}
