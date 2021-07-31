package JavaInterviewPrograms;

import java.util.Scanner;

public class EvenorOdd {

	

	public static void main(String[] args) {

		int a;
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter Number");
		a = sr.nextInt();
		System.out.println("Entered Number is: " + a);
		if (a % 2 == 0) {
			System.out.println("Entered Number is: " + a + " is even");
		} else {
			System.out.println("Entered Number is: " + a + " is odd");
		}

	}

}
