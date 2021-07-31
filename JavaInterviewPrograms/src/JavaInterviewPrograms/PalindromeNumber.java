package JavaInterviewPrograms;

public class PalindromeNumber {

	public static void isPalinDromeNumber(int num) {
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
		isPalinDromeNumber(151);
	}

}
