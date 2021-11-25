package Homework6;

public class Demo {
    public static void main(String[] args) {

        //да направим масив с хорица ;)

        Person []Persons= new Person[10];

        // създаваме малко новобранци от различен клас :)

        Person viki = new Person("Viki",23,true);
        Person kiro = new Person("Kirocho",32,true);

        Student niki = new Student("Niki",23,true,4);
        Student iveto = new Student("Iveto",25,false,5);

        Employee pesho = new Employee("Petyr",17,true,60);
        Employee gosho = new Employee("Gosho",28,true,73);
        Employee dani = new Employee("Dani",32,true,56);

        niki.setScore(6);




        // добавя ме ги в масива новобранците ;)

        Persons[0]=kiro ;
        Persons[1]=viki ;
        Persons[2]=niki ;
        Persons[3]=iveto ;
        Persons[4]=pesho ;
        Persons[5]=gosho ;
        Persons[6]=dani ;
        for(int i=0;i<Persons.length;i++) {
            Person p = Persons[i];
            if(p != null) {
                System.out.println("");
                if (p instanceof Student) {
                    ((Student) p).showStudentInfo();
                    continue;
                }
                if (p instanceof Employee) {
                    ((Employee) p).showEmployeeInfo();
                    continue;
                }
                if (p instanceof Person) {
                    p.showPersonInfo();
                }
            }
        }






        //да пробваме да видим инфо за тях :)
//
//        kiro.showPersonInfo();
//
//        pesho.showEmployeeInfo();


        //да видим колко ще вземат за работа и кой няма да вземе :)

        pesho.calculateOvertime(2);
        dani.calculateOvertime(2);
        gosho.calculateOvertime(2);
    }
}
