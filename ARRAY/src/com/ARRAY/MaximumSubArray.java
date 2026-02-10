package com.ARRAY;

public class MaximumSubArray {

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		System.out.println(subArray(arr));

	}

	private static int subArray(int[] arr) {

		int min = arr[0];
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {

			min = Math.max(min + arr[i], arr[i]);
			max = Math.max(max, min);
		}
		return max;

	}
}
