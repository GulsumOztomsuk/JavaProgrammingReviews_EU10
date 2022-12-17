package week13_3_12_2022.warmup;

import java.time.LocalDate;

public class Teacher {

    public String name,lastName;
    public char gender;
    public LocalDate dateOfBirth;
    public int age;
    public long id;

    public Teacher(String muhtar, String abc, char m, LocalDate of, long l) {
        this.name=name;
        this.lastName=lastName;
        this.gender=gender;
        this.dateOfBirth=dateOfBirth;
        this.id=id;
        //how we gwet the date for today int
        int currentYear=LocalDate.now().getYear();//2022
        int yearOfDateOfBirth=dateOfBirth.getYear();
        this.age=currentYear-yearOfDateOfBirth;
    }

    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    /*
    mac : command +N for seeing options for constructor and toString
    windows:
     */
}
/*Task 1 :



        1. create a class named Teacher that has the followings features:
        Attributes:
        name,lastName, gender, dateOfBirth(use LocalDate), age, id

        Methods:

        sets all the attributes of the teacher object
        toString(): returns the full info of teacher Object

 */