package SelefPractice;

public class FindDuplicateElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age[] = { 55, 33, 66, 77, 55, 33 };

		for (int i = 0; i < age.length; i++) {
			for (int j = i + 1; j < age.length; j++) {
				if (age[i] == age[j]) {
					System.out.println(age[j]);
				}
			}
		}

	}

}
