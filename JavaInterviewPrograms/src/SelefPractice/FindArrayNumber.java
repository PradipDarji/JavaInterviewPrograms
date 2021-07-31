package SelefPractice;

import java.util.Arrays;

public class FindArrayNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*****************************************************************************");
		int array[] = { 10, 5, 25, 58, 89, 1 };
		int size = array.length;
		Arrays.sort(array);
		System.out.println("sorted Array ::" + Arrays.toString(array));
		int res = array[size - 2];
		System.out.println("2nd largest element is ::" + res);
		System.out.println("*****************************************************************************");
	}

}
