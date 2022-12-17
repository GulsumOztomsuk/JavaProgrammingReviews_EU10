package week13_3_12_2022.warmup;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class School {

    static ArrayList<Teacher> teachers = new ArrayList<>();
    static String school = "Cydeo";

    static {
        Teacher teacher1 = new Teacher("Muhtar", "abc", 'M', LocalDate.of(1987, 1, 1), 1L);
        Teacher teacher2 = new Teacher("Gurhan", "abc", 'M', LocalDate.of(1987, 1, 1), 1L);
        Teacher teacher3 = new Teacher("Aysun", "abc", 'F', LocalDate.of(1988, 1, 1), 1L);
        Teacher teacher4 = new Teacher("Mike", "abc", 'M', LocalDate.of(1977, 1, 1), 1L);
        Teacher teacher5 = new Teacher("Saim", "abc", 'M', LocalDate.of(1989, 1, 1), 1L);
        Teacher teacher6 = new Teacher("Asya", "abc", 'F', LocalDate.of(1990, 1, 1), 1L);

        teachers.addAll(Arrays.asList(teacher1, teacher2, teacher3, teacher4, teacher5, teacher6));

    }

    public static void main(String[] args) {
        System.out.println(teachers);

        ArrayList<Teacher> result = getTeachersNameStartWith("Mi");
    }

    private static ArrayList<Teacher> getTeachersNameStartWith(String mi) {
        ArrayList<Teacher> result = new ArrayList<>();

        //I need to get teacher one by one
        for (Teacher teacher : teachers) {
            //I need to check the name if the name is starting with "M"
            if (teacher.name.startsWith(mi)) {
                //I will put inside result
                result.add(teacher);
            }

        }
        return result;

    }
}

   /* 2. create a class which is School with main method

    3. create a list of teacher in School class inside the STATIC BLOCK

    4. create a method in School class which is returning the list of teachers if the last name start with "M"

        5. create a method in School class then you will find the female teachers

    6. create a method in School class then find the teachers age smaller than 30

        7. create a methot in School class then find the teachers born in 1967 year

    */