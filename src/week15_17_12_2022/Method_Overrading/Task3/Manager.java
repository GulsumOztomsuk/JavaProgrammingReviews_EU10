package week15_17_12_2022.Method_Overrading.Task3;

public class Manager extends Employee{

    public int salary(){
        //I am getting the base salary from parent class
        return super.salary()+20000;
    }
}
