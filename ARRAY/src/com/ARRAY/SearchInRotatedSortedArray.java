package com.ARRAY;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			
			if (target == arr[mid]) {
				System.out.println(mid);
			}

			if (arr[start] <= arr[mid]) {
				if (arr[start] <= target && target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target > arr[mid] && target <= arr[end]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		
	}

}
