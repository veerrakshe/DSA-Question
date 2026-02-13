package com.ARRAY;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 4;

		rotatedArray(arr, k);
	}

	private static void rotatedArray(int[] arr, int k) {

		k = k % arr.length;
		int n = arr.length;

		rotate(arr, 0, n - 1);
		rotate(arr, 0, k - 1);
		rotate(arr, k, n - 1);
		System.out.println(Arrays.toString(arr));

	}

	private static void rotate(int[] arr, int start, int end) {

		while (start < end) {

			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
