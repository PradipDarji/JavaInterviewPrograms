package JavaInterviewPrograms;

public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 50, 70, 80, 5 };
		int b[] = new int[5];

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum of all the elements of an array: " + sum);

		System.out.println(b);
	}

}
