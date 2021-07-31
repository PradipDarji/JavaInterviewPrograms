package JavaInterviewPrograms;

import java.util.Arrays;

public class FindArrayNumber {

	public static void main(String[] args) {
		System.out.println("*****************************************************************************");
		int array[] = { 10, 5, 25, 58, 89, 1 };
		int size = array.length;
		Arrays.sort(array);
		System.out.println("sorted Array ::" + Arrays.toString(array));
		int res = array[size - 2];
		System.out.println("2nd largest element is ::" + res);
		System.out.println("*****************************************************************************");

		int temp, size1;
		int array1[] = { 10, 20, 25, 63, 96, 57 };
		size1 = array1.length;

		for (int i = 0; i < size1; i++) {
			for (int j = i + 1; j < size1; j++) {

				if (array1[i] > array1[j]) {
					temp = array[i];
					array1[i] = array1[j];
					array1[j] = temp;
				}
			}
		}
		System.out.println("Second largest number is:: " + array1[size1 - 2]);
	}

}
