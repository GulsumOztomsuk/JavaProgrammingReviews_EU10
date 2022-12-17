package week15_17_12_2022.Method_Overrading.Task1;

public class INGBank extends Bank{

    public void calculateTheInterest(){
        System.out.println(getCapital() *  9 / 100);
    }
}
