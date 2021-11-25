package Homework5;

public class StudentDemo {
    public static void main(String[] args) {
        Student Niki =new Student("Nikolai Zhechev","History",6,31);
        Niki.getName();

        Niki.setSubject("History");


        Niki.getSubject();

        Niki.getGrande();
        Niki.setGrande(5);
        Niki.setGrande(7);

        Niki.getGrande();

        Niki.getAge();



//        //String NikiFields = Niki.toString();
//        //System.out.println(NikiFields);
//
//        // да пробваме да дигнем годините :)
//        Niki.upYear();
//        //System.out.println(Niki.yearLnCollege);
//        Niki.upYear();
//        //System.out.println(Niki.yearLnCollege);
//        Niki.upYear();
//        //System.out.println(Niki.yearLnCollege);
//        Niki.upYear();
//        //System.out.println(Niki.yearLnCollege);
//        //System.out.println(Niki.isDegree);

        Student Iveto = new Student("Iveto","English",6,28);

//
//
//
//        //Тук условието малко ме обърка имаше няколко варианта на възможни методи.
//        //Избрах този в който въвеждаш успех и колко стипендия да добавиш на студента.
//
//        //да видим колко има в началото
        Iveto.getMoney();
//        System.out.println(Iveto.getMoney());
        Iveto.setMoney(100);
//        System.out.println(Iveto.getMoney());
        Iveto.getMoney();

////
//        Iveto.receiveScholarship(300);
//
//        //след получаване на стипендия да проверим
//
//
//        //теста за годините
//        Niki.receiveScholarship(300);
//
//        //тест за оцента
//        Iveto.receiveScholarship(300);
//
//

    }
}
