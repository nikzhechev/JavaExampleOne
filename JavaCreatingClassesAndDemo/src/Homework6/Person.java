package Homework6;

public class Person {

    private String name;
    protected int age;
    protected boolean isMale;


    public Person(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;


    }

    void showPersonInfo() {
        System.out.println("Name of Person: " + name);
        System.out.println("The person age : " + age);
        System.out.println("It`s the person is male : " + isMale);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return isMale;
    }
}
