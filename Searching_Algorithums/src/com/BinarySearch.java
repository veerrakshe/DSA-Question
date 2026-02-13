package com;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 5, 6, 7, 8, 9 };
		int target = 8;

		System.out.println(m1(arr, target));
	}

	private static int m1(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = (start + end) / 2;

			if (target == arr[mid]) {
				System.out.println(arr[mid]);
				return mid;
			} else if (target > arr[mid]) {

				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}

		return -1;
	}

}
