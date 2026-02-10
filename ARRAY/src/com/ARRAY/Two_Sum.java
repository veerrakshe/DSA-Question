package com.ARRAY;

import java.util.Arrays;

public class Two_Sum {

	public static void main(String[] args) {

		int[] arr = { 2, 7, 11, 15 };
		int target = 9;

		twoSum(arr, target);
	}

	private static void twoSum(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {

					int[] arr1 = { i, j };

					System.out.println(Arrays.toString(arr1));
				}
			}
		}

	}

}
