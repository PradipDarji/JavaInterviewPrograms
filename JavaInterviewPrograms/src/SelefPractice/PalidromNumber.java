package SelefPractice;

public class PalidromNumber {

	public static void isPalidrome(int num) {
		System.out.println("Entered number is:" + num);

		int sum = 0;
		int r = 0;
		int t;
		t = num;

		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}

		if (t == sum) {
			System.out.println("Entered number is palindrome");
		} else {
			System.out.println("Entered number is not palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalidrome(151);
	}

}
