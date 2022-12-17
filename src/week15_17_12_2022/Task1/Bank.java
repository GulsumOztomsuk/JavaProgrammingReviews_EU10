package week15_17_12_2022.Task1;

public class Bank {
    private int capital=10000;

    public int getCapital(){
        return capital;
    }

    //How we can get the class name
    //The answer isgetClass().getSimpleName.()

    public void calculateTheInterest(){
        System.out.println("Interest of the "+ getClass().getSimpleName());
    }
}
