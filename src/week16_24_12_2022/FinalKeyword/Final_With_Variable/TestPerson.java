package week16_24_12_2022.FinalKeyword.Final_With_Variable;

public class TestPerson {
    public static void main(String[] args) {
        Person person=new Person("14-01-1989","Adam");
        System.out.println(person);

        //person.birthDay="12-02-1989";
        person.setName("Adam");
        System.out.println(person);

    }
}
