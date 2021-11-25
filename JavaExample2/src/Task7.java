import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int num = sc.nextInt();

        for(int i = 3; i <= 3 * num; i += 3) {
            System.out.print(i);
            if (i != 3 * num) {
                System.out.print(",");
            }
        }

    }
}


