package SelefPractice;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		Scanner sr = new Scanner(System.in);
		System.out.print("Enter Number: ");
		a = sr.nextInt();
		System.out.println("Entered Number is: " + a);

		if (a % 2 == 0) {
			System.out.println("Entered number is even");
		} else {
			System.out.println("Entered number is odd");
		}

	}

}
