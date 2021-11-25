import java.util.Arrays;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer Lenovo = new Computer();
        Lenovo.operationSystem = "Windows";
        Lenovo.yearBirth = 2018;
        Lenovo.price = 1200;
        Lenovo.isNotebook = true;
        Lenovo.hardDiscMemory = 700;
        Lenovo.freeMemory = 670;

        Computer Dell = new Computer();
        Dell.operationSystem = "Linux";
        Dell.yearBirth = 2019;
        Dell.price = 900;
        Dell.isNotebook = false;
        Dell.hardDiscMemory = 300;
        Dell.freeMemory  = 270;

        System.out.println("Year of Birth: "+Lenovo.yearBirth);
        System.out.println("The price is: "+ Lenovo.price+"$");
        System.out.println("Is the laptop: "+ Lenovo.isNotebook);
        System.out.println("The Memory of Lenovo laptop: "+ Lenovo.hardDiscMemory+"Gb");
        System.out.println("The Free memory of Lenovo laptop: "+ Lenovo.freeMemory+"Gb");

        Lenovo.useMemory(570);






        System.out.println("Operation System : " + Dell.operationSystem);
        Dell.changeOperationSystem("Windows");
        System.out.println("Year of Birth: "+Dell.yearBirth);
        System.out.println("The price is: "+ Dell.price+"$");
        System.out.println("Is the laptop: "+ Dell.isNotebook);
        System.out.println("The Memory of Dell: "+ Dell.hardDiscMemory+"Gb");





        

        //String computerLenovo= Lenovo.toString();
        //System.out.println(computerLenovo);
        //String computerDell = Dell.toString();
        //System.out.println(computerDell);



    }
}
