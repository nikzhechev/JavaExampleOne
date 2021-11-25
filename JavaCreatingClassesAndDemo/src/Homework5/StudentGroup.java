package Homework5;

import java.util.Arrays;

public class StudentGroup {
    private String groupSubject;
    protected Student[] students;
    static int freePlaces;

    StudentGroup() {
        this.students = new Student[5];
        this.freePlaces = 5;

    }

    StudentGroup(String subject) {
        this();
        this.groupSubject = subject;

    }


    void addStudent(Student s) {
        if (!s.subject.equals(this.groupSubject)) {
            System.out.println( " :This student is not for this group");
            return;

        }
        if (freePlaces == 0) {
            System.out.println("Don`t have a free places for this group");

            return;
        }
        students[students.length - freePlaces] = s;


        freePlaces--;


    }

    void emptyGroup() {
        this.students = new Student[5];
        this.freePlaces = 5;

    }

    double theBestStudent() {
        Student max = students[1];

        for (int i = 0; i < students.length-freePlaces; i++) {
            if (students[i].grande > max.grande) {
                if(students[i]!=null)
                    max = students[i];


            }
        }

        System.out.println(" The max grande in group : " + max.grande);
        return max.grande;

    }

    void printStudentInGroup() {
        System.out.println(Arrays.toString(students));
    }


}
