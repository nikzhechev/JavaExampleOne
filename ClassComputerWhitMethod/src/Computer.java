public class Computer {
    int yearBirth;
    double price;
    boolean isNotebook;
    double hardDiscMemory;
    double freeMemory;
    String operationSystem;

    void changeOperationSystem(String newOperationSystem){
        operationSystem=newOperationSystem;
        System.out.println("New OperationSystem is :" + newOperationSystem);
    }
    void useMemory(int memory){
        if (memory>freeMemory){
            System.out.println("Not enough free memory!");

        }else {
            freeMemory = freeMemory - memory;
            System.out.println("You have so much free space left:  " + freeMemory);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "yearBirth=" + yearBirth +
                ", price=" + price +
                ", isNotebook=" + isNotebook +
                ", hardDiscMemory=" + hardDiscMemory +
                ", freeMemory=" + freeMemory +
                ", operationSystem='" + operationSystem + '\'' +
                '}';
    }
}
