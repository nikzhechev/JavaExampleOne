package Homework5;

public class College {
    public static void main(String[] args) {
        StudentGroup history = new StudentGroup("history");
        StudentGroup geo = new StudentGroup("geo");


        Student piki = new Student("Pikikk","mura",5,19);
        Student niki = new Student("Nikolai Zhechev", "history", 3, 29);
        Student iveto = new Student("Iveto Gigovas ", "history", 5, 29);
        Student pesho = new Student("Petyr", "history", 6, 30);
        Student tosho = new Student("Toshkata", "history", 4, 31);
        Student gosho = new Student("Goshkata","geo",5,23);


        piki.getSubject();

        niki.getMoney();
        niki.getName();




        // да вкараме малко новобранци :)
        history.addStudent(niki);
        history.addStudent(iveto);
        history.addStudent(tosho);
        history.addStudent(pesho);
//
//        //да добавим малко годинки към ученето :)
//        niki.upYear();
//        niki.upYear();
//        niki.upYear();
//        //айде вече да завършва ;)
//        niki.upYear();
//
//        //да пробваме да вкараме новобранец с друга специалност :)
//        history.addStudent(gosho);
//
//
//        // да изведе отличника :)
//        history.theBestStudent();
//
//        // да видим кой е вътре :)
        history.printStudentInGroup();
//
//        // да ги премахнем:)
//        history.emptyGroup();
//
//        // и да видим че няма никой :)
//        history.printStudentInGroup();
//
//
//
//        // да получи някой стипендия или да не я получи ;)
        iveto.receiveScholarship(300);
        iveto.getMoney();

//        gosho.receiveScholarship(300);
//
//        //тука Петърчно и Ники  ще горят :)
//        pesho.receiveScholarship(300);
//        niki.receiveScholarship(300);
//

    }
}
