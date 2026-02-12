package com;

public class LinearSearch {

	public static int m1(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return arr[i];
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int target = 6;

		System.out.println(m1(arr, target));
	}
}
