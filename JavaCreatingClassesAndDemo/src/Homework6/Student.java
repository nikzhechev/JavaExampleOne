package Homework6;

public class Student extends Person {
    private int score;


    Student(String name, int age, boolean isMale, int score) {
        super(name, age, isMale);
        this.score = score;

    }

    void showStudentInfo() {
        super.showPersonInfo();
        System.out.println("The score is: " + score);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score >= 2 && score <= 6)
            this.score = score;
        else {
            System.out.println("Invalid score!!!");
        }
    }
}
