package JavaInterviewPrograms;

public class ArrayPresentOnOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 10, 25, 30, 10, 25, 86 };

		for (int i = 0; i < array.length; i = i + 2) {
			System.out.println(array[i]);
		}
	}

}
