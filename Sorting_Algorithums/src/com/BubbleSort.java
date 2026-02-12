package com;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {

		int arr[] = { 1, 4, 2, 5, 3, 7, 9, 6};

		sort(arr);
	}

	private static void sort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}
}
