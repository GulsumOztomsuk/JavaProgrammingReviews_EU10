package week12_26_11_2022;

public class Employee {
    public String name;
    public int Id;
    public char gender;


    public Employee(String name, int id, char gender) {
        this.name = name;
        Id = id;
        this.gender = gender;
    }

    public Employee(String name){
        this.name=name;
    }
    public Employee(String name,int Id){
        this.name=name;
        this.Id=Id;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", gender=" + gender +
                '}';
    }
}

/*
We can overload toString method but if you want to see the result we need to call it
    public String toString(String name) {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gender=" + gender +
                '}';
    }
 */