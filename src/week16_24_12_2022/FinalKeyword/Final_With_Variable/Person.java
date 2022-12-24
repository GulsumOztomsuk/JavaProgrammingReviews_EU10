package week16_24_12_2022.FinalKeyword.Final_With_Variable;

public class Person {
    private String name;
    final private String BIRTHDAY;

    public Person(String BIRTHDAY, String name) {
        this.BIRTHDAY =BIRTHDAY;
        setName(name);
    }

    public String getBirthDay() {
        return BIRTHDAY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDay='" + BIRTHDAY + '\'' +
                '}';
    }
}
