package Homework5;

public class Student {
    private String name;
    protected String subject;
    protected double grande;
    protected int yearLnCollege;
    private int age;
    protected boolean isDegree;
    private double money;


    Student() {

        yearLnCollege = 1;
        isDegree = false;
        money = 0;
    }

    Student(String name, String subject, double grande, int age) {
        this();
        this.name = name;
        this.subject = subject;
        this.grande = grande;
        this.age = age;
    }

    public double getMoney() {
        System.out.println(money + " : This is balance of money");
        return money;

    }

    public void setMoney(double money) {
        if (money > 0) {
            this.money = money;
        }
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public int getAge() {
        System.out.println("The student age:" + age);
        return age;
    }

    public String getSubject() {
        System.out.println(subject + "   : The subject of student");
        return subject;
    }

    public void setSubject(String subject) {
        if (!subject.equals(this.subject))
            this.subject = subject;
        else if (subject.equals(this.subject)) {
                System.out.println("The new subject is equals the old subject");

        }


    }


    public void setAge(int age) {
        if (age > 1)
            this.age = age;
    }

    public double getGrande() {
        System.out.println(grande + " : the grande of student");
        return grande;
    }

    public void setGrande(double grande) {
        if (grande > 2 && grande <= 6)

            this.grande = grande;
        else {
            System.out.println("Is not valid grande");
        }
    }

    void upYear() {
        if (yearLnCollege == 4) {
            isDegree = true;
            System.out.println("The student is  finish his study! :  " + isDegree);
        } else {
            yearLnCollege++;
            System.out.println("Up one year :" + yearLnCollege);
        }
    }

    double receiveScholarship(double amount) {


        if (grande >= 4.50 && grande <= 6 && age < 30) {
            money = amount;
            System.out.println(name + ": have get scholarship!");
            System.out.println("The new balance of money : " + amount);

        } else {
            System.out.println("You don't have grande or age to get Scholarship!");
        }

        return money + amount;
    }





    @Override
    public String toString() {
        return "Homework5.Student{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", grande=" + grande +
                ", yearLnCollege=" + yearLnCollege +
                ", age=" + age +
                ", isDegree=" + isDegree +
                ", money=" + money +
                '}';
    }
}
