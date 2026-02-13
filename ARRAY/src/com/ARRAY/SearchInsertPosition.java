package com.ARRAY;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 8 };
		int target = 0;

		System.out.println(index(arr, target));
	}

	private static int index(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (arr[mid] == target) {
				return mid;
			}
			if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return start;

	}

}
