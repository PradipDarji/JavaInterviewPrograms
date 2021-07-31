package SelefPractice;

public class ArmstrongNUmber {

	public static void isArmstrong(int num) {
		System.out.println("Entered number is:" + num);
		int cube = 0;
		int r;
		int t;
		t = num;

		while (num > 0) {
			r = num % 10;
			num = num / 10;
			cube = cube + (r * r * r);
		}

		if (t == cube) {
			System.out.println("Entered number is armstrong");
		} else {
			System.out.println("Entered number is not armstrong");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongNUmber.isArmstrong(153);
	}

}
