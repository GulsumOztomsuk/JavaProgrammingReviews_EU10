package week15_17_12_2022.Method_Overrading.Task3;

public class Clerk extends Employee{
    public int salary(){
   return super.salary()+10000;
    }
}
