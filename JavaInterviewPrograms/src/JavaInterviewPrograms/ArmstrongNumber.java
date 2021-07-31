package JavaInterviewPrograms;

public class ArmstrongNumber {

	public static void isArmstrongNumber(int num) {
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
			System.out.println("Entered number is Armstrong");
		} else {
			System.out.println("Entered number is not Armstrong");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isArmstrongNumber(153);
	}

}
