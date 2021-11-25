package Homework6;

import javax.management.PersistentMBean;

public class Employee extends Person {
    private double daySalary;


    Employee(String name, int age, boolean isMale, double daySalary) {
        super(name, age, isMale);

        this.daySalary = daySalary;
    }

    double calculateOvertime(double hours) {
        double sum = 8;
        double oneHourSum = daySalary / sum;
        if (age < 18) {
            System.out.println("You don`t have age to get overtime money");
            return 0;

        } else {

            double overTimeCalc = oneHourSum * 1.5;
            double overTimeSum = hours * overTimeCalc;
            System.out.println("Overtime: " + hours + " hours");
            System.out.println("The sum of pay for overtime:" + overTimeSum);
            return overTimeSum;


        }
    }

    void showEmployeeInfo() {
        super.showPersonInfo();
        System.out.println("Per day salary: " + daySalary);
    }

    public double getDaySalary() {
        return daySalary;
    }
}
