import java.util.Scanner;

public class Zad5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = sc.nextInt();

		System.out.println("Enter b:");
		int b = sc.nextInt();

		System.out.println("Enter c:");
		int c = sc.nextInt();

		if (a >= b){ //In this case, b is always before a in all subcases
			if (b >= c)
				System.out.print("In order " + c + " "+ b + " " + a);

			else if  (c >= a)
				System.out.print("In order " + b + " "+ a + " " + c);

			else if (a > c)
				System.out.print("In order " + b + " " + c + " " + a);
		}

		if (b > a){// In this case, a is always before b in all subcases
			if (c >= b)
				System.out.print("In order " + a + " " + b + " "+ c);
			else if (c >= a)
				System.out.print("In order " + a + " " + c + " " + b);
			else if (a > c)
				System.out.print("In order " + c + " " + a + " " + b);
		}

	}
}
