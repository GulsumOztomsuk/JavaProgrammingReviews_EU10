package week15_17_12_2022.Method_Overrading.Task1;

public class AkBank extends Bank{
  public void calculateTheInterest(){
      System.out.println(getCapital() * 7 / 100);
  }
}
